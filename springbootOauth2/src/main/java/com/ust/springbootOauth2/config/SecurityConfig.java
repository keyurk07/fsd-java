package com.ust.springbootOauth2.config;

//import java.beans.Customizer;
import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
//import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception{
		return http
				.authorizeHttpRequests(registry -> {
					registry.anyRequest().authenticated();
				})
				.oauth2Login(Customizer.withDefaults())
				.build();
	}

}
