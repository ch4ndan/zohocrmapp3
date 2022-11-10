package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Contacts;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listallcontacts")
	public String listAllContacts(Model model) {
		List<Contacts> contact = contactService.getAllContacts();
		model.addAttribute("contact", contact);
		return "list_contact";
	}

}
