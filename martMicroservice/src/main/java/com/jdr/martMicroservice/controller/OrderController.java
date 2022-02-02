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

import com.jdr.martMicroservice.entity.Order;
import com.jdr.martMicroservice.service.OrderService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/order")
	public ResponseEntity<Object> addOrder(@RequestBody Order order) {

		orderService.addOrder(order);
		return new ResponseEntity<>(null);
	}

	@DeleteMapping("/order/{id}")
	public ResponseEntity<Object> deleteOrder(@PathVariable Long id) {

		orderService.deleteOrder(id);
		return new ResponseEntity<>(null);
	}

	@GetMapping("/order/{id}")
	public ResponseEntity<Object> getOrder(@PathVariable Long id) {
		orderService.getOrder(id);
		return new ResponseEntity<>(null);
	}

	@GetMapping("/order")
	public ResponseEntity<Object> getOrders() {
		orderService.getOrders();
		return new ResponseEntity<>(null);
	}

	@PutMapping("/order")
	public ResponseEntity<Object> updateOrder(@RequestBody Order order) {

		orderService.updateOrder(order);
		return new ResponseEntity<>(null);
	}
}
