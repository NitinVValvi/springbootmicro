package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebSeviceDemoApplication {

	public static void main(String[] args) {
		System.out.println("This is Springboot WebService");
		SpringApplication.run(WebSeviceDemoApplication.class, args);
	}

}
