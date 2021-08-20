package com.service.vehicleservice.service;

import com.repository.daolayer.model.Vehicle;


public interface VehicleService 
{

	public Vehicle get(Long id);
	
	public Vehicle save(Vehicle vehicle);
	
	public Vehicle update(Vehicle vehicle);
	
	public String delete(Long id);
}
