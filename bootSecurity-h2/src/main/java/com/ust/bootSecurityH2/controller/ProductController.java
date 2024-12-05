package com.ust.bootSecurityH2.controller;

//import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;
import java.util.Optional;
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

import com.ust.bootSecurityH2.model.Product;
import com.ust.bootSecurityH2.service.ProductService;

//import com.ust.rest.model.Product;
//import com.ust.rest.service.ProductService;

@RestController // Controller + response body //Spring MVC - Response - we return a ViewResolver - write to body of html 
@RequestMapping("/product/api1.0") // root of the resource/controller 
public class ProductController {
	
	Logger logger = Logger.getLogger("ProductController.class");

	@Autowired
	private ProductService prodService;
	
	@GetMapping(value="/productsinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> displayProducts(){
		List<Product> products = prodService.getAllProducts();
		return ResponseEntity.ok().body(products);
	}
	
	@GetMapping(value="/product/{id}")
	public ResponseEntity<Product> getById(@PathVariable long id){
		Optional<Product> optional = prodService.getProductById(id);
		if(optional.isPresent())
			return ResponseEntity.ok().body(optional.get());
		else
			return ResponseEntity.noContent().build();
	}
	
	@GetMapping(value="/productByBrand/{brandName}")
	public ResponseEntity<List<Product>> getByBrand(@PathVariable String brandName){
		List<Product> product = prodService.getByBrandName(brandName);

			return ResponseEntity.ok().body(product);

	}
	
	@PostMapping(value="/addProduct", consumes=MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		logger.info("Entered POST method" + product);
		Product savedProduct = prodService.addProduct(product);
		logger.info("Persisted Product"+ savedProduct);
		
		return ResponseEntity.ok().body(savedProduct);		
	}
	
	@PutMapping(value="/modify/{id}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product,@PathVariable long id){
		Optional<Product> newProduct = prodService.getProductById(id);
		if(newProduct.isPresent()) {
			prodService.updateProduct(product);
			return ResponseEntity.ok().body(product);
			}
		else
			return ResponseEntity.noContent().build();
		
	}
	
	@DeleteMapping(value="/remove/{id}")
	public String deleteById(@PathVariable long id) {
		prodService.deleteById(id);
		return "Deleted Succesfully......";

	}

}
