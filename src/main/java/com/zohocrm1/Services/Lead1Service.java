package com.zohocrm1.Services;

import java.util.List;

import com.zohocrm1.entities.Lead;

public interface Lead1Service {
	public void saveLead(Lead lead);

	public List<Lead> findAllLeads();

	public Lead getLead(long id);

	public void deleteLead(long id);
}
