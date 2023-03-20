package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@RequestMapping(value  = "/registerEmployee" ,method = RequestMethod.POST)
	public String regdata(@RequestBody Employee emp)
	{
			hs.SaveData(emp);
		
		return "success";
	}
	
	@RequestMapping(value = "/getEmpbyempId/{empId}",method = RequestMethod.GET)
	public Employee getEmpdataByMobileno(@PathVariable ("empId") int empId)
	{
		Employee emp = hs.getEmpById(empId);
		return emp;
		
	}
}
