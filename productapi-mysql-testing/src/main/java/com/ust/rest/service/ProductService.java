package com.ust.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.model.Product;
import com.ust.rest.repository.ProductRepository;

//import jakarta.validation.constraints.AssertFalse.List;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product addProduct(Product newProduct) {
		return repository.save(newProduct);
	}
	
	public List<Product> getAllProducts(){
		return repository.findAll();	
	}
	
	public Optional<Product> getProductById(long id) {
		return repository.findById(id);
	}
	
	public List<Product> getByBrandName(String brandName){
		return repository.findByBrand(brandName);
	}
	
	public void deleteById(long id) {
		 repository.deleteById(id);
	}
	
	public Product updateProduct(Product product){
		return repository.save(product);
	}
}	
