package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.main.model.Student;


@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	RestTemplate restT;
	
	
	@RequestMapping("/getconsumedata/{un}/{ps}")
	public List getData(@PathVariable ("un") String uname, @PathVariable ("ps") String pass)
	{
		
		System.out.println("username is " +uname);
		System.out.println("password is "+pass);
		String url ="http://localhost:9198/getproducedata";
		
		List li = restT.getForObject(url, List.class);
		
		return li;
		
	}
	
	@RequestMapping(value ="/regconsumedata", method = RequestMethod.POST)
	public String regdata(@RequestBody Student s)
	{
		//System.out.println(s.getName());
		String url = "http://localhost:9198/regproducedata";
		
		String val  = restT.postForObject(url, s, String.class);
		return val; 
	}
}
