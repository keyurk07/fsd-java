package com.ust.identityProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MaIdentityProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaIdentityProviderApplication.class, args);
	}

}
