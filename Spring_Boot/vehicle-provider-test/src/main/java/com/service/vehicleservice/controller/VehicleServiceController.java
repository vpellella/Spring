package com.service.vehicleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.repository.daolayer.model.Vehicle;
import com.service.vehicleservice.service.VehicleService;

@RestController
@RequestMapping(path = "/vehicle")
public class VehicleServiceController 
{

	@Autowired
	VehicleService vehicleService;
	
	@RequestMapping(method =  RequestMethod.GET)
	public Vehicle get(@RequestParam("id") Long id)
	{
		return vehicleService.get(id);
		
	}
	
	@RequestMapping(method =  RequestMethod.POST)
	public Vehicle save(@RequestBody Vehicle vehicle)
	{
		return vehicleService.save(vehicle);
		
	}
	
	@RequestMapping(method =  RequestMethod.PUT)
	public Vehicle put(@RequestBody Vehicle vehicle)
	{
		return vehicleService.update(vehicle);
		
	}
	
	@RequestMapping(method =  RequestMethod.DELETE)
	public String delete(@RequestParam("id") Long id)
	{
		return vehicleService.delete(id);
		
	}
}
