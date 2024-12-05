package com.ust.cloudGatewawy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MaCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaCloudGatewayApplication.class, args);
	}

}
