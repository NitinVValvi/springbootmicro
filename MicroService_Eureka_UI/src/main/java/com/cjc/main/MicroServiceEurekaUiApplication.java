package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceEurekaUiApplication {

	public static void main(String[] args) {
		
		System.out.println("This is Microservice UI");
		SpringApplication.run(MicroServiceEurekaUiApplication.class, args);
	
	}

}
