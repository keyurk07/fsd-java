package com.ust.feignClient.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ust.feignClient.interfaces.ProductFeignInterface;
import com.ust.feignClient.model.Product;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/client")
public class FeignClient {
	
	@Autowired
	private ProductFeignInterface feignClient;
	
	@GetMapping("/allproducts")
	public List<Product> getAll(){
		return feignClient.getAllProducts();
	}
	
	@GetMapping("/productById/{id}")
	public Product getOneProductById(@PathVariable long id) {
		return feignClient.getProductById(id);
	}
	
	@GetMapping("/productByBrandName/{brandName}")
	public List<Product> productAllByBrandName(@PathVariable String brandName) {
		return feignClient.getProductByBrandName(brandName);
	}
	
	@PostMapping("/addNewProduct")
	public Product addOneNewProduct(@RequestBody Product product) {
		return feignClient.addNewProduct(product);
	}
	
	@PutMapping("/updateProduct/{id}")
	public Product updateOneExistingProduct(@RequestBody Product product,@PathVariable long id) {
		return feignClient.updateExistingProduct(product, id);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteOneProductById(@PathVariable long id) {
		return feignClient.deleteProductById(id);
	}
	
	
	

}
