package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {

	@RequestMapping("/getproduceadmin")
	public List prelogin()
	{
		Student s1 = new Student(101,"admin","admin","admin","Pune");
		Student s2 = new Student(102,"abc","abc","abc","Pune");
		
		List li = new ArrayList();
		li.add(s1);
		li.add(s2);
		
		return li;
	}
}
