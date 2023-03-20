package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceClientExamApplication {

	public static void main(String[] args) {
		System.out.println("This is Microservice Client Exam");
		SpringApplication.run(MicroserviceClientExamApplication.class, args);
	}

}
