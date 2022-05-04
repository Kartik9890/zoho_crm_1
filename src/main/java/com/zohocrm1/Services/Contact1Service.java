package com.zohocrm1.Services;

import java.util.List;

import com.zohocrm1.entities.Contact;
import com.zohocrm1.entities.Lead;

public interface Contact1Service {
	public void saveContact(Contact contact);

	public List<Contact> findAllContacts();

	public Contact getContact(long id);

}
