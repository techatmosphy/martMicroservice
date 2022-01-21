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

import com.jdr.martMicroservice.entity.Customer;
import com.jdr.martMicroservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired CustomerService customerService;
	@GetMapping
	public ResponseEntity<Object> get(@RequestBody Customer customer) {
		
		customerService.get();
		return new ResponseEntity<>(null);
	}

	@PostMapping
	public ResponseEntity<Object> add(@RequestBody Customer customer) {

		customerService.add();
		return new ResponseEntity<>(null);
	}

	@PutMapping
	public ResponseEntity<Object> update(@RequestBody Customer customer) {

		customerService.update();
		return new ResponseEntity<>(null);
	}

	@DeleteMapping
	public ResponseEntity<Object> delete(@RequestBody Customer customer) {

		customerService.delete();
		return new ResponseEntity<>(null);
	}
}
