package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.Homeservice;

@RestController
public class HomeController {

	@Autowired
	Homeservice hs;
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public Employee regdata(@RequestBody Employee emp) 
	{
		hs.SaveData(emp);
		
		return emp;
	}
	
	@RequestMapping(value ="/getdata", method=RequestMethod.GET)
	public List<Employee> getdata()
	{
		
		List<Employee> li =hs.getAllEmp();
		return li;
	}
	
	
}
