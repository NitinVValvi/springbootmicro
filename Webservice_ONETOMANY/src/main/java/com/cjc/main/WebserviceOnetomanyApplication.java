package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class WebserviceOnetomanyApplication {

	public static void main(String[] args) {
		System.out.println("OnetoMany Webservices");
		SpringApplication.run(WebserviceOnetomanyApplication.class, args);
	}

}
