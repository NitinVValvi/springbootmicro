package com.app.criatosoft.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.criatosoft.main.model.Applicant;
import com.app.criatosoft.main.service.AppService;

@RequestMapping("/")
@RestController
public class ApplicationController {

	@Autowired
	AppService appservice;
	
	@PostMapping("/submitapp")
	public ResponseEntity<Applicant>  submitApplication(@RequestBody Applicant app)
	{
	Applicant newapp = 	appservice.submitApplication(app);
	return new ResponseEntity<Applicant>(newapp,HttpStatus.CREATED);
	}
}
