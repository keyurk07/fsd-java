package com.ust.bootSecurityMysql.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ust.bootSecurityMysql.model.MyUser;

public class MyUserDetails implements UserDetails{ //UserDetails come from in build package
	
	private String userName;
	private String password;
	private List<GrantedAuthority> authorities; //Granted authority is spring security class
	
	public MyUserDetails(MyUser user) {
		userName = user.getUsername();
		password = user.getPassword();
		authorities = Arrays.stream(user.getRole().split(",")) // String role = 'ADMIN,USER,OPS,HR'
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList()); // Converting a comma seperated string into an arraylist
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true ;
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}
	

}
