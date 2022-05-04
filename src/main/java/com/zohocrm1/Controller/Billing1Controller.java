package com.zohocrm1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm1.Services.Billing1Service;
import com.zohocrm1.entities.Billing;
import com.zohocrm1.entities.Lead;

@Controller
public class Billing1Controller {

	@Autowired
	private Billing1Service billingService;
	
	@RequestMapping ("/generate")
	public String generateBill(@ModelAttribute("bill")Billing bill) {
		billingService.generateOneBill(bill);
		return"billing_info";
		
	}
	
	
	@RequestMapping("/listallbills")
	public String listAllBills(ModelMap model) {
		List<Billing> bills = billingService.findAllBills();
		model.addAttribute("bills", bills);
		return "billing_result";
	
}}

