package com.ust.microservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("m1")
public class controller {
	@GetMapping("/hello")
	public String helloService() {
		return "Hello from microservice1";
	}
}
