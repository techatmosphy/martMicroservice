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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdr.martMicroservice.bean.GenericResponse;
import com.jdr.martMicroservice.bean.ProductRequest;
import com.jdr.martMicroservice.entity.Product;
import com.jdr.martMicroservice.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductContoller {

	@Autowired
	ProductService productService;

	@PostMapping
	public ResponseEntity<GenericResponse> addProduct(@RequestBody ProductRequest productRequest) {
		Product prod = productService.addProduct(productRequest);
		GenericResponse response = new GenericResponse();
		if (prod != null) {
			response.setMessage("Product created successfully");
			response.getData().add(prod);
			return new ResponseEntity<GenericResponse>(response, HttpStatus.CREATED);
		}
		response.setError("Error in creating cateogory ");
		return new ResponseEntity<GenericResponse>(response, HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<GenericResponse> deleteProduct(@PathVariable Long id) {

		productService.deleteProduct(id);
		GenericResponse response = new GenericResponse();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<GenericResponse> getProduct(@PathVariable Long id) {
		Optional<Product> product = productService.getProduct(id);
		GenericResponse response = new GenericResponse();
		if (product.isPresent()) {
			response.setMessage("Product retrieved successfully");
			response.getData().add(product);
			return new ResponseEntity<GenericResponse>(response, HttpStatus.OK);
		}
		response.setError("Product not found for id : " + id);
		return new ResponseEntity<GenericResponse>(response, HttpStatus.NOT_FOUND);
	}

	@GetMapping
	public ResponseEntity<GenericResponse> getProducts() {
		List<Product> products = productService.getProducts();
		GenericResponse response = new GenericResponse();
		response.setMessage("Products retrieved successfully");
		response.getData().addAll(products);
		return new ResponseEntity<GenericResponse>(response, HttpStatus.OK);

	}

	@PutMapping
	public ResponseEntity<GenericResponse> updateProduct(@RequestBody ProductRequest productRequest) {
		Product prod = productService.updateProduct(productRequest);
		GenericResponse response = new GenericResponse();
		if (prod != null) {
			response.setMessage("Product updated successfully");
			response.getData().add(prod);
			return new ResponseEntity<GenericResponse>(response, HttpStatus.CREATED);
		}
		response.setError("Error in updated cateogory ");
		return new ResponseEntity<GenericResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/gtin/{gtin}")
	public ResponseEntity<GenericResponse> getProductByGtin(@PathVariable Long gtin) {
		Product product = productService.getProductByGtin(gtin);
		GenericResponse response = new GenericResponse();
		if (product != null) {
			response.setMessage("Product retrieved successfully");
			response.getData().add(product);
			return new ResponseEntity<GenericResponse>(response, HttpStatus.OK);
		}
		response.setError("Product not found for id : " + gtin);
		return new ResponseEntity<GenericResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping()
	public ResponseEntity<GenericResponse> deleteAllProducts() {

		productService.deleteAll();
		GenericResponse response = new GenericResponse();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
