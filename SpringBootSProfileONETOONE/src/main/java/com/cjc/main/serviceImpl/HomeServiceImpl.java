package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repo.HomeRepository;
import com.cjc.main.service.Homeservice;

@Service
public class HomeServiceImpl implements Homeservice{

	@Autowired
	HomeRepository hr;
	
	@Override
	public Employee SaveData(Employee emp) {
		
		return hr.save(emp) ;
	}

	@Override
	public List<Employee> getAllEmp() {
	
		List<Employee> li = hr.findAll();
		return li;
	}

}
