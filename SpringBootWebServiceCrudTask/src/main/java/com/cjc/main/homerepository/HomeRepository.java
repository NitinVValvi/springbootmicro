package com.cjc.main.homerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.Student;

public interface HomeRepository extends JpaRepository<Student, Integer> {

	Student findByUsernameAndPassword(String username, String password);

	Student findBySid(int sid);

}
