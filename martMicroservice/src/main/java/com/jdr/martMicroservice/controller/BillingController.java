package com.jdr.martMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdr.martMicroservice.service.ProductService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BillingController {

	@Autowired
	ProductService productService;
	@RequestMapping("/billing/{id}")
	public String get(@PathVariable Long pin) {
		System.out.println("hello world");
		productService.getProduct(pin);
		return "hello world";
	}

}
