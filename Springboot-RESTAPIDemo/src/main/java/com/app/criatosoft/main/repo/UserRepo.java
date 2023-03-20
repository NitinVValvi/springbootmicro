package com.app.criatosoft.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.criatosoft.main.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
