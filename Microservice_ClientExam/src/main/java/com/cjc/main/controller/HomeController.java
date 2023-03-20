package com.cjc.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping
	public String prelogin()
	{
		return "Welcome Exam ";
	}
}
