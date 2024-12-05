package com.ust.rest.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ust.rest.model.Product;

import io.swagger.v3.oas.models.media.MediaType;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductControllerTest {
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	public static final Product product = Product.builder()
			.id(1)
			.brand("Van Hussain")
			.description("Smart Digital Mobile Phone")
			.qty(20)
			.price(20000)
			.build();
	private static final String APPLICATION_JSON_VALUE= MediaType.APPLICATION_JSON_VALUE;
			ObjectMapper mapper = new ObjectMapper();
			

}
