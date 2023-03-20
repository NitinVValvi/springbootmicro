package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {

	@RequestMapping("/getProduceData")
	public List getAllData()
	{
		Student s = new Student();
		s.setRollno(1);
		s.setName("Nitin");
		s.setUname("nitin");
		s.setPass("nitin123");
		s.setAddr("Pune");
		
		List al = new ArrayList();
		al.add(s);
		return al;
		
	}
}
