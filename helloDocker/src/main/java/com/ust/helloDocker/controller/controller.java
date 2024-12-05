package com.ust.helloDocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class controller {
	
	@GetMapping("/test")
	public String getMethodName() {
		return "Connnected to docker .... ";
	}
	

}
