package com.service.profileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.repository.daolayer.model.Customer;
import com.service.profileservice.service.CustomerProfileService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerProfileController
{
	
	@Autowired
	CustomerProfileService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public Customer create(@RequestBody Customer customer)
	{
		return service.save(customer);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Customer get(@RequestParam("id") Long id)
	{
		return service.get(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Customer update(@RequestBody Customer customer)
	{
		return service.update(customer);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public String delete(@RequestParam("id") Long id)
	{
		return service.delete(id);
	}

}
