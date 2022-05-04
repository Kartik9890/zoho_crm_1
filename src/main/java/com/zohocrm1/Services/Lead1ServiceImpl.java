package com.zohocrm1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm1.Repositories.Lead1Repository;
import com.zohocrm1.entities.Lead;

@Service
public class Lead1ServiceImpl implements Lead1Service {

	@Autowired
	private Lead1Repository leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
		
	}

	@Override
	public List<Lead> findAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead getLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead= findById.get();
		return lead;
	}

	@Override
	public void deleteLead(long id) {
			leadRepo.deleteById(id);		
	}

}
