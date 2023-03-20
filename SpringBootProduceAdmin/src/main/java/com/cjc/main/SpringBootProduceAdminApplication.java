package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProduceAdminApplication {

	public static void main(String[] args) {
		
		System.out.println("This IS Admin Produce Application");
		SpringApplication.run(SpringBootProduceAdminApplication.class, args);
	}

}
