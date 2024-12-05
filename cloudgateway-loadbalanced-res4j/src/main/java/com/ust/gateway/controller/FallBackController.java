package com.ust.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/myfallback")
	public ResponseEntity<String> fallBackMethod(){
		return 
				ResponseEntity.status(
						HttpStatus.INTERNAL_SERVER_ERROR).body("Please try after sometime...");
	}

}
