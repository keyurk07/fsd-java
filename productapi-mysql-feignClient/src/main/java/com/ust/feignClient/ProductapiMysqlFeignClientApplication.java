package com.ust.feignClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductapiMysqlFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductapiMysqlFeignClientApplication.class, args);
	}

}
