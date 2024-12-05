package com.ust.bootSecurityMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bootSecurityMysql.model.MyUser;
import com.ust.bootSecurityMysql.repository.UserRepository;

@RequestMapping("/register")
@RestController
public class RegistrationController {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	PasswordEncoder encoder;
	
	@PostMapping("/add")
	public MyUser newUser(@RequestBody MyUser user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return userRepo.save(user);
	}

}
