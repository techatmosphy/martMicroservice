package com.jdr.martMicroservice.controller;

import java.util.List;
import java.util.Optional;

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

		Optional<Product> product=productService.getProduct(id);
		return new ResponseEntity<>(product,HttpStatus.OK);
	}

	@GetMapping("/product")
	public ResponseEntity<List<Product>> getProducts() {

		List<Product> productList=productService.getProducts();
		return new ResponseEntity<>(productList,HttpStatus.OK);
	}

	@PostMapping("/product")
	public ResponseEntity<Product> addProduct(@RequestBody Product theProduct) {

		Product product = productService.addProduct(theProduct);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@PutMapping("/product")
	public ResponseEntity<Product> updateProduct(@RequestBody Product theProduct) {

		Product product = productService.updateProduct(theProduct);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@DeleteMapping("/product/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable Long id) {

		productService.deleteProduct(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
