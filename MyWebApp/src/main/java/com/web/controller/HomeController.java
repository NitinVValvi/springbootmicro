package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Student;

@Controller
public class HomeController {
	/*
	 * @RequestMapping("home") public String home(@RequestParam("sname") String
	 * myName,Model m) {
	 * 
	 * System.out.println("hello" + myName); m.addAttribute("name", myName); return
	 * "home"; }
	 */
	@RequestMapping("home")
	public String home(Student s,Model m)
	{
		m.addAttribute("obj",s);
		
		return "home";
	}
	
	
}
