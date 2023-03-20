package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

	@Autowired
	RestTemplate restT;

	@RequestMapping(value ="/getconsumedata/{un}/{ps}",method =RequestMethod.GET)
	public List getData(@PathVariable("un") String username, @PathVariable("ps") String password) {
		String admin = "admin";
		if (username.equals(admin) && password.equals(admin)) {
			String url = "http://localhost:8282/getproduceadmin";

			List li = restT.getForObject(url, List.class);

			return li;
		} else {
			String url = "http://localhost:8283/getproducecjc";
			List li = restT.getForObject(url, List.class);
			return li;
		}
	}
}
