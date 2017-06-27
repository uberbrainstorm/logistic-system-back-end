package com.logisticsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LogisticSystemRegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogisticSystemRegistrationServiceApplication.class, args);
	}
}
