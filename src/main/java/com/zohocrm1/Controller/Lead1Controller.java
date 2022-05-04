package com.zohocrm1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm1.Services.Contact1Service;
import com.zohocrm1.Services.Lead1Service;
import com.zohocrm1.entities.Contact;
import com.zohocrm1.entities.Lead;

@Controller
public class Lead1Controller {

	@Autowired
	private Lead1Service leadService;
	
	@Autowired
	private Contact1Service contactService;
	
	@RequestMapping("/view")
	public String viewCreateLeadPage() {
		return "create_lead";
	}

	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/listallleads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.findAllLeads();
		model.addAttribute("leads", leads);
		return "lead_result";
	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id")long id,ModelMap model) {
		Lead lead=leadService.getLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id,ModelMap model) {
		Lead lead=leadService.getLead(id);
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadsource(lead.getLeadsource());
		contact.setMobile(lead.getMobile());
		contactService.saveContact(contact);
		leadService.deleteLead(id);
		List<Contact> contacts = contactService.findAllContacts();
		model.addAttribute("contacts", contacts);
		return"contact_result";
	}
}
