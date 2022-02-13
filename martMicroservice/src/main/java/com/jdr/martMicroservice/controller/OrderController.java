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
import com.jdr.martMicroservice.bean.OrderRequest;
import com.jdr.martMicroservice.entity.Order;
import com.jdr.martMicroservice.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping()
	public ResponseEntity<GenericResponse> addOrder(@RequestBody OrderRequest orderRequest) {

		Order order = orderService.addOrder(orderRequest);

		GenericResponse response = new GenericResponse();
		if (order != null) {
			response.setMessage("Order created successfully");
			response.getData().add(order);
			return new ResponseEntity<GenericResponse>(response, HttpStatus.CREATED);
		}
		response.setError("Error in creating order ");
		return new ResponseEntity<GenericResponse>(response, HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<GenericResponse> deleteOrder(@PathVariable Long id) {
		orderService.deleteOrder(id);
		GenericResponse response = new GenericResponse();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<GenericResponse> getOrder(@PathVariable Long id) {
		Optional<Order> order = orderService.getOrder(id);
		GenericResponse response = new GenericResponse();
		if (order.isPresent()) {
			response.setMessage("Order retrieved successfully");
			response.getData().add(order.get());
			return new ResponseEntity<GenericResponse>(response, HttpStatus.OK);
		}
		response.setError("Product not found for id : " + id);
		return new ResponseEntity<GenericResponse>(response, HttpStatus.NOT_FOUND);
	}

	@GetMapping()
	public ResponseEntity<GenericResponse> getOrders() {
		List<Order> orders = orderService.getOrders();
		GenericResponse response = new GenericResponse();
		response.setMessage("Orders retrieved successfully");
		response.getData().addAll(orders);
		return new ResponseEntity<GenericResponse>(response, HttpStatus.OK);
	}

	@PutMapping()
	public ResponseEntity<GenericResponse> updateOrder(@RequestBody Order order) {

		Order orderRes = orderService.updateOrder(order);
		GenericResponse response = new GenericResponse();
		if (orderRes != null) {
			response.setMessage("Order updated successfully");
			response.getData().add(orderRes);
			return new ResponseEntity<GenericResponse>(response, HttpStatus.CREATED);
		}
		response.setError("Error in updated cateogory ");
		return new ResponseEntity<GenericResponse>(response, HttpStatus.NOT_FOUND);
	}
}
