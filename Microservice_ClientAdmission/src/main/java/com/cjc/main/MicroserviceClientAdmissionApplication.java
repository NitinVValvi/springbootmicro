package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceClientAdmissionApplication {

	public static void main(String[] args) {
		System.out.println("This is microservice Admission Client");
		SpringApplication.run(MicroserviceClientAdmissionApplication.class, args);
	}

}
