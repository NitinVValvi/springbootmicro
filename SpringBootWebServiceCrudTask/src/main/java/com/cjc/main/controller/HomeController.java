package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@RequestMapping(value="/register" ,method= RequestMethod.POST)
	public String register(@RequestBody Student s)
	{
		hs.saveStuData(s);
		return "Data Inserted Successfully";
	}
	
	@RequestMapping(value ="/login/{un}/{ps}",method = RequestMethod.GET)
	public Iterable<Student> logindata(@PathVariable("un")String username,@PathVariable("ps") String password)
	{
		Student s = hs.logincheck(username,password);
		Iterable<Student> list = hs.StuAllData();
		
		return list;
	}
	
	@RequestMapping(value ="/getsinglestu/{un}/{ps}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("un") String username, @PathVariable("ps") String password)
	{
		Student s = hs.logincheck(username, password);
		return hs.getSingleEmp(username,password);
	}
	
	
	@RequestMapping(value="/getsingle/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") int sid) {
		
		return hs.getStu(sid);
		
	}
	@RequestMapping(value="/deletestu/{id}",method=RequestMethod.DELETE)
	public List<Student> deleteStu(@PathVariable("id") int sid)
	{
		List<Student> stulist = hs.deleteStuBySid(sid);
		return stulist;
	}
	
	@RequestMapping(value ="/updatemin/{id}/{mobno}/{city}",method = RequestMethod.PATCH)
	public Student saveorpartialupdateStudent(@PathVariable("id") int sid, @PathVariable("mobno") String mobno,@PathVariable("city") String city)
	{
		Student s = hs.getStu(sid);
		s.setMobno(mobno);
		s.setCity(city);
		hs.saveStuData(s);
		return s;
	}
	
	@RequestMapping(value ="/update", method = RequestMethod.PUT)
	public Student update(@RequestBody Student stu)
	{
		hs.saveStuData(stu);
		return stu;
		
	}
	
}
