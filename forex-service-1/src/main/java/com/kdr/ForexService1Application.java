package com.kdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ForexService1Application {

	public static void main(String[] args) {
		SpringApplication.run(ForexService1Application.class, args);
	}

}
