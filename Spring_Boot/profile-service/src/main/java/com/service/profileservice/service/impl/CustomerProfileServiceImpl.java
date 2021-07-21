package com.service.profileservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.daolayer.model.Customer;
import com.service.profileservice.repository.CustomerRepository;
import com.service.profileservice.service.CustomerProfileService;

@Service
public class CustomerProfileServiceImpl implements CustomerProfileService
{
	@Autowired
	CustomerRepository customerRepository; 
	
	@Override
	public Customer get(Long customerId) 
	{
		Optional<Customer> customerOpt = customerRepository.findById(customerId);
		return customerOpt.orElse(null);
		
	}

	@Override
	public Customer save(Customer customer) 
	{
		return customerRepository.save(customer);
	}
	
	
	@Override
	public Customer update(Customer customer) 
	{
		return customerRepository.save(customer);
	}
	
	
	
	@Override
	public String delete(Long id) 
	{
		
		Customer customer = get(id);
		if(customer == null)
		{
			return "Customer doesn't exist with Id: "+ id;
		}
		try
		{
			customerRepository.deleteById(id);
		}
		catch(Exception e)
		{
			return "Error encountered while deleting the customer record with Id: " + id;
		}
		return "Customer with Id: " + id + " deleted successfully";
	}
}
