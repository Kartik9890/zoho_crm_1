package com.zohocrm1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm1.entities.Contact;
import com.zohocrm1.entities.Lead;

public interface Contact1Repository extends JpaRepository<Contact, Long> {

}
