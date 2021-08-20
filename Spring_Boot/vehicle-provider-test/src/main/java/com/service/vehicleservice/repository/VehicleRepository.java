package com.service.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repository.daolayer.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
