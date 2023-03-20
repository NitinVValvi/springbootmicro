package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootConsumeApplication {

	public static void main(String[] args) {
		System.out.println("This is service consumer app");
		SpringApplication.run(SpringBootConsumeApplication.class, args);
	}
	
	@Bean
	public RestTemplate restT()
	{
		RestTemplate rt = new RestTemplate();
		return rt;
	}

}
