package com.app.task.restapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.task.restapi.entity.User;
import com.app.task.restapi.repo.UserRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl {

	@Autowired
	private UserRepo userRepo;
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public User createUser(User user) {
	
		return userRepo.save(user);
	}
	
	
}
