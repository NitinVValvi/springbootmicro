package com.app.task.restapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.task.restapi.entity.User;
import com.app.task.restapi.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/api")
@Validated
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user){
		
		User saveUser = userService.createUser(user);
		return new  ResponseEntity<User>(saveUser,HttpStatus.OK);
	}
}
