package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class MakeMyTripConsumeApplication {

	public static void main(String[] args) {
		
		System.out.println("this is our make my trip app");
		
		SpringApplication.run(MakeMyTripConsumeApplication.class, args);
	}

	
	@Bean
	public RestTemplate restT()
	{
		RestTemplate rt = new RestTemplate();
		
		return rt;
		
	}
	
	
}
