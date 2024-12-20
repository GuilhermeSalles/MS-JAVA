package com.guilherme.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrWokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrWokerApplication.class, args);
	}

}
