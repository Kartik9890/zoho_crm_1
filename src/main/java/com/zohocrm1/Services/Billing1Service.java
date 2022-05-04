package com.zohocrm1.Services;

import java.util.List;

import com.zohocrm1.entities.Billing;

public interface Billing1Service {

	public void generateOneBill(Billing bill);

	public List<Billing> findAllBills();
	
	
}
