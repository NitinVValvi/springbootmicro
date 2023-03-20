package com.cjc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.web.model.Student;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String prelogin()
	{
			return "login";
	}
	
	@RequestMapping("log")
	public String loginpage(@RequestParam ("username") String un,@RequestParam ("password") String ps)
	{
		System.out.println("username is :: "+un);
		System.out.println("password is :: "+ps);
		
		
		return "success";
	}
	
	@RequestMapping("/reg")
	public String preregister()
	{
		System.out.println("this is registration page");
		return "registration";
	}
	
	@RequestMapping("/registration")
	public String registerdata(@ModelAttribute Student s, ModelMap m )
	{
		System.out.println(s.toString());
		
		m.addAttribute("data",s);
		
		return "success";
	}
	
}
