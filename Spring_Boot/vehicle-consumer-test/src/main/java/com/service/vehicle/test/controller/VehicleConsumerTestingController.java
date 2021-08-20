package com.service.vehicle.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.repository.daolayer.model.Vehicle;

@RestController
public class VehicleConsumerTestingController 
{

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(path = "/getVehicle/{id}")
	public Vehicle getVehicle(@PathVariable("id") Long id)
	{
		Vehicle vehicle = restTemplate.getForObject("http://vehicle/vehicle?id="+id, Vehicle.class);
		return vehicle;
	}
}
