package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer> {

	public Student findByMobno(long mob);
	
	public Student findByUsernameAndPassword(String username,String password);

	public Student findByUid(int uid);
}
