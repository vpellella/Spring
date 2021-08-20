package com.service.vehicleservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.daolayer.model.Customer;
import com.repository.daolayer.model.Vehicle;
import com.service.vehicleservice.repository.VehicleRepository;
import com.service.vehicleservice.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService
{

	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public Vehicle get(Long id)
	{
		Optional<Vehicle> vehicleOpt = vehicleRepository.findById(id);
		return vehicleOpt.orElse(null);
		
	}

	@Override
	public Vehicle save(Vehicle vehicle) 
	{
		System.out.println(vehicle.getName() + vehicle.getSpecifications());
		return vehicleRepository.save(vehicle);
	}

	@Override
	public Vehicle update(Vehicle vehicle)
	{
		return vehicleRepository.save(vehicle);
	}

	@Override
	public String delete(Long id)
	{
		Vehicle vehicle = get(id);
		if(vehicle == null)
		{
			return "Vehicle doesn't exist with Id: "+ id;
		}
		try
		{
			vehicleRepository.deleteById(id);
		}
		catch(Exception e)
		{
			return "Error encountered while deleting the Vehicle record with Id: " + id;
		}
		return "Vehicle with Id: " + id + " deleted successfully";
	}

}
