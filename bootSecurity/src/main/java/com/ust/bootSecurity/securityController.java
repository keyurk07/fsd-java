package com.ust.bootSecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
//@RequestMapping("/securityController")
public class securityController {
	@GetMapping("/")
	public String greet() {
		return "working ....  ";
	}
	
	@GetMapping("/admin")
	public String greetAdmin() {
		return "Admin@Work ";
	}
	
	@GetMapping("/user")
	public String greetUser() {
		return "User@Work ";
	}
	

}
