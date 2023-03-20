package com.app.criatosoft.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.criatosoft.main.model.UserDetails;
import com.app.criatosoft.main.service.UserService;

@RestController
@RequestMapping(value ="/api/v3")
public class UserController {

	@Autowired
	private UserService userService;
	
	//@RequestMapping(value = "/employees" ,method = RequestMethod.GET)
	@GetMapping("/user")
	public String getUser() {
		
		return "users";
	}
	
	@GetMapping("/users/{user_id}")
	public String getUsers(@PathVariable("user_id") Long user_id) {
		
		return "users details for id"+user_id;
	}
	
	@PostMapping("/users")
	public ResponseEntity<UserDetails> saveUserDetails( @RequestBody UserDetails user) {
		UserDetails userd =  userService.saveUserDetails(user) ;
		return new ResponseEntity<UserDetails>(userd,HttpStatus.CREATED);
	}
	
	@GetMapping("/allusers")
	public List<UserDetails> getallUsers(){
		
		return userService.getUsers(); 
	}
}
