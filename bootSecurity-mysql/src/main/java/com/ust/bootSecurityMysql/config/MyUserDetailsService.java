package com.ust.bootSecurityMysql.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.bootSecurityMysql.model.MyUser;
import com.ust.bootSecurityMysql.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException{
		Optional<MyUser> user = userRepo.findByUsername(username);
		System.out.println(user.get().getUsername());
		return user.map(MyUserDetails::new)
				.orElseThrow(()->new UsernameNotFoundException("User not found " + username));
		
	}
	

}
