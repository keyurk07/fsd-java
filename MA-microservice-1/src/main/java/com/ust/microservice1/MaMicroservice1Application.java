package com.ust.microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MaMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(MaMicroservice1Application.class, args);
	}

}
