package com.ust.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ust.client.model.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/client/api1.0")
public class ProductController {
	
	@Autowired
	RestTemplate template;
	
	public final static String CLIENT_SERVICE = "clientService";
	
	@GetMapping("/getString")
	@CircuitBreaker(name=CLIENT_SERVICE, fallbackMethod="callOnFail")
	public String fetchString() {
		String url = "http://localhost:8091/helloservice/test";
		return template.getForObject(url, String.class);
//		String ans = template.getForEntity(url, String., null)
		
	}
	
	public String callOnFail(Exception e) {
		return " message from callOnFunction()";
	}
	
//	@GetMapping("/getAllProducts")
//	public List<Product> fetchProducts() {
//		String url = "http://localhost:8072/helloservice/test";
//		List<Product> list = template.getForObject(url, List.class);
//		return list;
//	}
	
//	@GetMapping("/getProduct/{id}")
//	public Product fetchProductById(@PathVariable long id) {
//			String url = "http://localhost:8090/product/api1.0/product/" + id;
//			Product prod = template.getForObject(url, Product.class);
//			return prod;
//			
//	}
	
//	@PostMapping("/addProduct/{id},{brand},{description},{qty},{price}")
//	public Product addProduct(@PathVariable long id, String brand, String description, int qty, int price) {
//		String url = "http://localhost:8090/product/api1.0/addProduct/" + id + brand + description + qty + price;
//		Product prod = template.postForObject(url, Product.class);
//		return prod;
//	}
	 
	

}
