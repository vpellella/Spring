package com.service.profileservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.repository.daolayer.model.Customer;
import com.service.profileservice.repository.CustomerRepository;

public interface CustomerProfileService 
{
	public Customer get(Long id);
	
	public Customer save(Customer customer);
	
	public Customer update(Customer customer);
	
	public String delete(Long id);
	
}
