package com.jdr.martMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdr.martMicroservice.entity.Customer;
import com.jdr.martMicroservice.service.CustomerService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/customer/{id}")
	public ResponseEntity<Object> getCustomer(@PathVariable Long id) {

		customerService.getCustomer(id);
		return new ResponseEntity<>(null);
	}

	@GetMapping("/customer")
	public ResponseEntity<Object> getCustomers() {

		customerService.getCustomers();
		return new ResponseEntity<>(null);
	}

	@PostMapping("/customer")
	public ResponseEntity<Object> addCustomer(@RequestBody Customer customer) {

		customerService.addCustomer(customer);
		return new ResponseEntity<>(null);
	}

	@PutMapping("/customer")
	public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer) {

		customerService.updateCustomer(customer);
		return new ResponseEntity<>(null);
	}

	@DeleteMapping("/customer/{id}")
	public ResponseEntity<Object> deleteCustomer(@PathVariable Long id) {

		customerService.deleteCustomer(id);
		return new ResponseEntity<>(null);
	}
}
