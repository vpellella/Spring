package com.repository.daolayer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "VEHICLE")
@Data
@NoArgsConstructor
public class Vehicle 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String name;
	
	private String type;
	
	@Column(length = 15, nullable = false, unique = true)
	private String registrationNo;
	
	private String specifications;
	
	private Integer year;
	
	
	private Boolean isAvailable;

}
