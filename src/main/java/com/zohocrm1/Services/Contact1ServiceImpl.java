package com.zohocrm1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm1.Repositories.Contact1Repository;
import com.zohocrm1.Repositories.Lead1Repository;
import com.zohocrm1.entities.Contact;
import com.zohocrm1.entities.Lead;

@Service
public class Contact1ServiceImpl implements Contact1Service {

	@Autowired
	private Contact1Repository contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);

	}

	@Override
	public List<Contact> findAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContact(long id) {
		Contact contact = contactRepo.getById(id);
		return contact;
	}

}
