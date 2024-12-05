package com.ust.bootSecurityH2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.bootSecurityH2.model.Product;

//import com.ust.rest.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	public List<Product> findByBrand(String brandName);
	
}
