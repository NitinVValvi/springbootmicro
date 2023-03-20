package com.app.criatosoft.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.criatosoft.main.model.UserDetails;
import com.app.criatosoft.main.repo.UserRepositoy;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepositoy userRepositoy;
	
	
	@Override
	public List<UserDetails> getUsers() {
	
		return userRepositoy.findAll();
		
	}


	@Override
	public UserDetails saveUserDetails(UserDetails user) {
		// TODO Auto-generated method stub
		return userRepositoy.save(user);
	}

}
