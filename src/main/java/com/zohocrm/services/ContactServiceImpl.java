package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public void saveContact(Contacts contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts> contact = contactRepo.findAll();
		return contact;
	}

	@Override
	public Contacts findContactById(long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contact = findById.get();
		return contact;
	}

	@Override
	public Contacts getContactById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
