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

import com.jdr.martMicroservice.entity.Order;
import com.jdr.martMicroservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping()
	public ResponseEntity<Object> get(@RequestBody Order order) {
		orderService.get();
		return new ResponseEntity<>(null);
	}

	@PostMapping
	public ResponseEntity<Object> add(@RequestBody Order order) {

		orderService.add();
		return new ResponseEntity<>(null);
	}

	@PutMapping
	public ResponseEntity<Object> update(@RequestBody Order order) {

		orderService.update();
		return new ResponseEntity<>(null);
	}

	@DeleteMapping
	public ResponseEntity<Object> delete(@RequestBody Order order) {

		orderService.delete();
		return new ResponseEntity<>(null);
	}
}
