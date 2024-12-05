package com.ust.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloservice")
public class HelloController {
	
	@Autowired
	Environment environment; 
	
	@GetMapping("/test")
	public String confirm() {
		return "Connected..." +"  from port#" + environment.getProperty("local.server.port");
	}
	
	@GetMapping("/testInteger")
	public int sendInt() {
		return 5;
	}

}