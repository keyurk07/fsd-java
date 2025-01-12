package com.ust.rest.repository;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.ust.rest.model.Product;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductRepositoryTest {
	
	@Autowired
	ProductRepository repository;
	
	@Test
	@Order(1)
	@Rollback(value = false)
	public void saveProductTest() {
		Product product = Product.builder()
				.id(1)
				.brand("Van Hussain")
				.description("Smart Digital Mobile Phone")
				.qty(20)
				.price(20000)
				.build();
		repository.save(product);
				
	}
	
	@Test
	@Order(2)
	public void getProductTest() {
		
//		Action
		Product product = repository.findById(1L).get();
//		Verify
		System.out.println(product);
		Assertions.assertThat(product.getId()).isEqualTo(1L);
	}
	
	@Test
	@Order(3)
	public void getListOfProductsTest() {
//		Action
		List<Product> products = repository.findAll();
//		Verify
		System.out.println(products);
		Assertions.assertThat(products.size()).isGreaterThan(0);
	}
	
	@Test
	@Order(4)
	@Rollback(value = false)
	public void updateProductTest() {
//		Action
		Product product = repository.findById(1L).get();
		product.setDescription("Novel ");
		Product updateProduct = repository.save(product);
//		Verify
		System.out.println(updateProduct);
		Assertions.assertThat(updateProduct.getDescription()).isEqualTo("Novel ");
	}
	
//	@Test
//	@Order(5)
//	public void deleteProductTest() {
////		Action
//		repository.deleteById(1L);
//		Product product = repository.findById(1L).get();
////		Verify
//		System.out.println(product);
//		Assertions.assertThat(product.isNull());
//		
//	}

}

