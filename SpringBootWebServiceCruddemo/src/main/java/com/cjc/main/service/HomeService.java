package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Employee;

public interface HomeService {

	public Employee saveEmpData(Employee emp);

	public List<Employee> displayAllData();

	public Employee getEmp(int id);

	public void delete(int id);

	public List<Employee> deleteEmpById(int id);
	
	
}
