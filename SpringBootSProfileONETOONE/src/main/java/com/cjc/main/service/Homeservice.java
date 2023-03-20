package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Employee;

public interface Homeservice {
public Employee SaveData(Employee emp);

public List<Employee> getAllEmp();
	
}
