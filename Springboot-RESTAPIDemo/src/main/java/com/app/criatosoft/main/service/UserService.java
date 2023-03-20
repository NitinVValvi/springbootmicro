package com.app.criatosoft.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.criatosoft.main.entity.User;
import com.app.criatosoft.main.repo.UserRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

	@Autowired
	private UserRepo userRepo;


	public User createUser(User user) {
	
		return userRepo.save(user);
	}
	
	
}
