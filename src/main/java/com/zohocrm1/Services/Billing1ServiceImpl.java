package com.zohocrm1.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm1.Repositories.Billing1Repository;
import com.zohocrm1.entities.Billing;

@Service
public class Billing1ServiceImpl implements Billing1Service {

	@Autowired
	private Billing1Repository billingRepo;

	@Override
	public void generateOneBill(Billing bill) {
		billingRepo.save(bill);
		
	}

	@Override
	public List<Billing> findAllBills() {
		List<Billing> bills = billingRepo.findAll();
		return bills;
	}

}
