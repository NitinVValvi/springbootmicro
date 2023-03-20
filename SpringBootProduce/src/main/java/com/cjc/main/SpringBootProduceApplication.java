package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class SpringBootProduceApplication {

	public static void main(String[] args) {
		System.out.println("This is produce data app");
		SpringApplication.run(SpringBootProduceApplication.class, args);
	}

}
