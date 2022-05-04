package com.zohocrm1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm1.utilities.Email1Service;

@Controller
public class Email1Controller {
	
	@Autowired
	private Email1Service emailService;

	@RequestMapping("/compose")
	public String composeEmail(@RequestParam("emailId")String email, ModelMap model) {
	model.addAttribute("email", email);
	return"compose_email";
}

	@RequestMapping ("/sendEmail")
	public String sendEmail(@RequestParam("to")String to, @RequestParam("subject")String subject,@RequestParam("body")String body) {
		emailService.sendSimpleMessage(to, subject, body);
		return"compose_email";
}
	}
