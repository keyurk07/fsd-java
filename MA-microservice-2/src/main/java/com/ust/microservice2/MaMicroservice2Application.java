package com.ust.microservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MaMicroservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(MaMicroservice2Application.class, args);
	}

}
