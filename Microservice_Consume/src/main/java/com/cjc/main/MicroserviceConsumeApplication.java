package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceConsumeApplication {

	public static void main(String[] args) {
		
		System.out.println("This is Microservice Consume");
		SpringApplication.run(MicroserviceConsumeApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restT()
	{
		RestTemplate rt = new RestTemplate();
		return rt;
	}
}
