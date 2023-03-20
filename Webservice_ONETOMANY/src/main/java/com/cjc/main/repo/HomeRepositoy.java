package com.cjc.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Employee;

@Repository
public interface HomeRepositoy extends JpaRepository<Employee, Integer>{

	public Employee getByEmpId(int empId);



}
