package com.logisticsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableAutoConfiguration
@EnableEurekaClient
@EnableFeignClients
public class LogisticSystemDriverServiceApplication {

    public static void main(String [] args){
        System.setProperty("spring.config.name", "driver-service");
        SpringApplication.run(LogisticSystemDriverServiceApplication.class, args);
    }
}
