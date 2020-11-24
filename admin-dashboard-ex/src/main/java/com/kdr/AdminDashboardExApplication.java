package com.kdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class AdminDashboardExApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminDashboardExApplication.class, args);
	}

}
