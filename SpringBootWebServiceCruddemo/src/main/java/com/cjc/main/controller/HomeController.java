package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@RequestMapping(value ="/register",method= RequestMethod.POST)
	public String regdata(@RequestBody() Employee emp)
	{
		hs.saveEmpData(emp);
		System.out.println("Emp name: "+emp.getEname());
		System.out.println("Emp addr:" +emp.getAddr());
		System.out.println("Emp mobno: "+emp.getMobno());
		return "data registered Successfully";
	}
	
	@RequestMapping(value="/getList" , method = RequestMethod.GET)
	public List<Employee> displayEmplist()
	{
		List<Employee> list= hs.displayAllData();
		
		return list;
	}
	
	@RequestMapping(value="/getsingle/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") int sid) {
		
		return hs.getEmp(sid);
		
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable ("id") int id)
	{
		hs.delete(id);
		return "data deleted";
	}
	
	@RequestMapping(value="/update",method = RequestMethod.PUT)
	public Employee saveorupdateEmp(@RequestBody Employee emp)
	{
		hs.saveEmpData(emp);
			return emp;
	}

	@RequestMapping(value="/deleteemp/{id}",method=RequestMethod.DELETE)
	public List<Employee> deleteEmp(@PathVariable("id") int id)
	{
		List<Employee> emlist = hs.deleteEmpById(id);
		return emlist;
	}

}
