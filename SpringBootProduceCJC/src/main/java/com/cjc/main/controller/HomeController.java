package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {

	
	@RequestMapping("/getproducecjc")
	public List prelogin()
	{
		Student s1 = new Student(101,"cjc","cjc","cjc","Pune");
		Student s2 = new Student(102,"xyz","xyz","xyz","Pune");
		
		List li = new ArrayList();
		li.add(s1);
		li.add(s2);
		
		return li;
	}
}
