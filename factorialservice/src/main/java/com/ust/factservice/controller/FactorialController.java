package com.ust.factservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial/api1.0")
public class FactorialController {
	
	@GetMapping("/factorial/{d}")
	public int factorialCalculator(@PathVariable int d) {
		int fact=1;
		for(int i=1; i<=d; i++) {
			fact = fact*i;
		}
		return fact;
	}

}
