package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {

	/*
	 * @RequestMapping("/") public Student prelogin() { Student s = new Student(0,
	 * null, null); s.setId(101); s.setName("Nitin"); s.setCity("Pune");
	 * 
	 * return s; }
	 */
	
	@RequestMapping("/")
	public List<Student> displaylist()
	{
		List<Student> stulist = new ArrayList<Student>();
		
		stulist.add(new Student(102,"Sunil","Gujrat"));
		stulist.add(new Student(103,"Sagar","Pune"));
		stulist.add(new Student(104,"Vishnu","Aurangabad"));
		stulist.add(new Student(105,"Sanket","Mumbai"));
		return stulist;
	}
}
