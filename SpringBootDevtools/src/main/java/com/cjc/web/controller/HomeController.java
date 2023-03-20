package com.cjc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
		
	@RequestMapping("/log1")
	public String loginpage()
	{
		return "success";
	}
	
	@RequestMapping("/*")
	public String errorPage()
	{
		return "error";
	}
}
