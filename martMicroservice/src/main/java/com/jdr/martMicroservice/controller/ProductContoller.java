package com.jdr.martMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdr.martMicroservice.entity.Product;
import com.jdr.martMicroservice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductContoller {

	@Autowired ProductService productService;

	@GetMapping
	public ResponseEntity<Object> get(@RequestBody Product product) {

		productService.get();
	return new ResponseEntity<>(null);
	}
	
	@PostMapping
	public ResponseEntity<Object> add(@RequestBody Product product) {

		productService.add();
	return new ResponseEntity<>(null);
	}
	
	@PutMapping
	public ResponseEntity<Object> update(@RequestBody Product product) {

		productService.update();
		return new ResponseEntity<>(null);
	}
	
	@DeleteMapping
	public ResponseEntity<Object> delete(@RequestBody Product product) {

		productService.delete();
		return new ResponseEntity<>(null);
	}
}
