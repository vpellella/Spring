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
@Table(name = "CUSTOMER")
@Data
@NoArgsConstructor
public class Customer
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 15, name = "FIRST_NAME", nullable = false)
	private String firstName;
	
	@Column(length = 15, name = "LAST_NAME", nullable = false)
	private String lastName;
	
	@Column(length = 15, nullable = false, unique = true)
	private String dlNumber;
	

}
