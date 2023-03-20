package com.app.criatosoft.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.criatosoft.main.model.UserDetails;

@Repository
public interface UserRepositoy extends JpaRepository<UserDetails, Long> {

}
