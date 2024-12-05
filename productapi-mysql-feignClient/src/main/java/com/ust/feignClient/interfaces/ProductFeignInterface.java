package com.ust.feignClient.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.ust.feignClient.model.Product;

@FeignClient(value = "productFeignClient", url = "http://localhost:8090/product/api1.0")
//@RequestMapping
public interface ProductFeignInterface {
	
	
	@GetMapping("/productsinfo") //this /products should match the endpoint created in service api
	public List<Product> getAllProducts();
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable long id); 
	
	@GetMapping("/productByBrand/{brandName}")
	public List<Product> getProductByBrandName(@PathVariable String brandName);
	
	@PostMapping("/addProduct")
	public Product addNewProduct(@RequestBody Product product);
	
	@PutMapping("/modify/{id}")
	public Product updateExistingProduct(@RequestBody Product product,@PathVariable long id);
	
	@DeleteMapping("/remove/{id}")
	public String deleteProductById(@PathVariable long id);
}
