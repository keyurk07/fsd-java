package com.ust.bootSecurityH2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.bootSecurityH2.service.MyUser;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Long> {
	
	Optional<MyUser> findByUsername(String username);

}
