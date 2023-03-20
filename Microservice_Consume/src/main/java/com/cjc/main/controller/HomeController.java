package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin("*")
public class HomeController {

	@Autowired
	RestTemplate restT;
	
	@RequestMapping("/getConsumeData/{un}/{ps}")
	public List getAllData(@PathVariable("un") String un, @PathVariable("ps") String ps)
	{
		//String url ="http://localhost:9095/getProduceData";
		System.out.println("username" +un);
		System.out.println("password" +ps);
		String url ="http://zuul/pro/getProduceData";
		List al = restT.getForObject(url, List.class);
	
		return al;
	}
	
}
