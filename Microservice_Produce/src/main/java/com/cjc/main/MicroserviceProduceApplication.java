package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceProduceApplication {

	public static void main(String[] args) {
		
		
		System.out.println("This is Producer");
		SpringApplication.run(MicroserviceProduceApplication.class, args);
	}

}
