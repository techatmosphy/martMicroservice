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

import com.jdr.martMicroservice.entity.Shipment;
import com.jdr.martMicroservice.service.ShipmentService;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

	@Autowired
	ShipmentService shipmentService;

	@GetMapping
	public ResponseEntity<Object> get(@RequestBody Shipment shipment) {

		shipmentService.get();
		return new ResponseEntity<>(null);
	}

	@PostMapping
	public ResponseEntity<Object> add(@RequestBody Shipment shipment) {

		shipmentService.add();

		return new ResponseEntity<>(null);
	}

	@PutMapping
	public ResponseEntity<Object> update(@RequestBody Shipment shipment) {
		shipmentService.update();

		return new ResponseEntity<>(null);
	}

	@DeleteMapping
	public ResponseEntity<Object> delete(@RequestBody Shipment Shipment) {
		shipmentService.delete();

		return new ResponseEntity<>(null);
	}

}
