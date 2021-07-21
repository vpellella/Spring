package com.service.profileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repository.daolayer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
