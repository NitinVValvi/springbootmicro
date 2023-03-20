package com.app.criatosoft.main.service;

import java.util.List;

import com.app.criatosoft.main.model.UserDetails;

public interface UserService {

	public List<UserDetails> getUsers();
	
	public UserDetails saveUserDetails(UserDetails user); 
}
