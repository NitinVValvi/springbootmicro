package com.app.task.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.task.restapi.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	
	
}
