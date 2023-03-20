package com.app.criatosoft.main.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.criatosoft.main.entity.User;
import com.app.criatosoft.main.service.UserService;


@RestController
@RequestMapping("/api")
@Validated
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@Validated @RequestBody User user){
		
		User saveUser = userService.createUser(user);
		return new ResponseEntity<User>(saveUser,HttpStatus.CREATED);
	}
}
