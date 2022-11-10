package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contacts;

public interface ContactService {
	public void saveContact(Contacts contact);

	public List<Contacts> getAllContacts();

	Contacts findContactById(long id);

	public Contacts getContactById(long id);
}
