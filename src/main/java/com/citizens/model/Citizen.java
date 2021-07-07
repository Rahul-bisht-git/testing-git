package com.citizens.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private Integer vaccinationCenterId;
	
	public Citizen(Integer id,String name) {
	this.id=id;
	this.name=name;
	}
	public Citizen() {
		
	}

	
	
	
}
