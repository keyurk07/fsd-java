package com.ust.springbootOauth2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to UST@Trivandrum";
	}


}
