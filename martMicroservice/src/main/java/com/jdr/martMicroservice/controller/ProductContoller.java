package com.jdr.martMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdr.martMicroservice.entity.Product;
import com.jdr.martMicroservice.service.ProductService;

@RestController
public class ProductContoller {

	@Autowired
	ProductService productService;

	@GetMapping("/product/{id}")
	public ResponseEntity<Object> getProduct(@PathVariable Long id) {

		productService.getProduct(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/product")
	public ResponseEntity<Object> getProducts() {

		productService.getProducts();
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/product")
	public ResponseEntity<Object> addProduct(@RequestBody Product product) {

		productService.addProduct(product);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/product")
	public ResponseEntity<Object> updateProduct(@RequestBody Product product) {

		productService.updateProduct(product);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/product/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable Long id) {

		productService.deleteProduct(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
