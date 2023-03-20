package com.cjc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProfileApplication {

	public static void main(String[] args) {
		
		System.out.println("This is Profile");
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}

}
