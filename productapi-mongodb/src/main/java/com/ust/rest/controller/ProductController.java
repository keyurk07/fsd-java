package com.ust.rest.controller;

//import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.model.Product;
import com.ust.rest.service.ProductService;

@RestController // Controller + response body //Spring MVC - Response - we return a ViewResolver - write to body of html 
@RequestMapping("/product/api1.0") // root of the resource/controller 
public class ProductController {
	
	Logger logger = Logger.getLogger("ProductController.class");

	@Autowired
	private ProductService prodService;
	
	@GetMapping(value="/productsinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> displayProducts(){
		return null;
	}
	
	@GetMapping(value="/product/{id}")
	public ResponseEntity<Product> getById(@PathVariable long id){
		return null;
	}
	
	@GetMapping(value="/productByBrand/{brandName}")
	public ResponseEntity<Product> getByBrand(@PathVariable String brandName){
		return null;
	}
	
	@PostMapping(value="/addProduct", consumes=MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		logger.info("Entered POST method" + product);
		Product savedProduct = prodService.addProduct(product);
		logger.info("Persisted Product"+ savedProduct);
		
		return ResponseEntity.ok().body(savedProduct);		
	}
	
	@PutMapping(value="/modify")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		return null;
	}
	
	@DeleteMapping(value="/remove/{id}")
	public void deleteById(@PathVariable long id) {

	}

}
