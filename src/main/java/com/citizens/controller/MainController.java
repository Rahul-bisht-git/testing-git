package com.citizens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citizens.model.Citizen;
import com.citizens.model.repo.CitizenRepo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/citizen")
@Slf4j
public class MainController {
	
	@Autowired
	CitizenRepo citizenRepo;
	
	@GetMapping("/id/{id}")
	public ResponseEntity<List<Citizen>> getCitizen(@PathVariable Integer id){

	List<Citizen> list=	citizenRepo.findByVaccinationCenterId(id);

	return new ResponseEntity<>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<List<Citizen>> getCitizen122(@PathVariable Integer id){

	List<Citizen> list=	citizenRepo.findByVaccinationCenterId(id);

	return new ResponseEntity<>(list,HttpStatus.OK);
		
	}

}
