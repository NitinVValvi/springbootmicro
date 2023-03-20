package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.main.homeservice.HomeService;
import com.cjc.main.model.Student;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@RequestMapping("/getproducedata")
	public List prelogin()
	{
		
		Student s = new Student();
		s.setRollno(101);
		s.setName("Nitin");
		s.setUname("nitin");
		s.setPass("nitin123");
		s.setAddr("Pune");
		
		List list = new ArrayList();
		list.add(s);
		return list;
	}
	
	@PostMapping("/regproducedata")
	public String regdata(@RequestBody Student s)
	{
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getUname());
		System.out.println(s.getPass());
		System.out.println(s.getAddr());
		hs.savedata(s);
		return "success";
	}
}
