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

import com.jdr.martMicroservice.entity.Shipment;
import com.jdr.martMicroservice.service.ShipmentService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ShipmentController {

	@Autowired
	ShipmentService shipmentService;

	@PostMapping("/shipment")
	public ResponseEntity<Object> addShipment(@RequestBody Shipment shipment) {

		shipmentService.addShipment(shipment);

		return new ResponseEntity<>(null);
	}

	@DeleteMapping("/shipment/{id}")
	public ResponseEntity<Object> deleteShipment(@PathVariable Long id) {
		shipmentService.deleteShipment(id);

		return new ResponseEntity<>(null);
	}

	@GetMapping("/shipment")
	public ResponseEntity<Object> getAllShipment() {

		shipmentService.getShipments();
		return new ResponseEntity<>(null);
	}

	@GetMapping("/shipment/{id}")
	public ResponseEntity<Object> getShipment(@PathVariable Long id) {

		shipmentService.getShipment(id);
		return new ResponseEntity<>(null);
	}

	@PutMapping("/shipment")
	public ResponseEntity<Object> updateShipment(@RequestBody Shipment shipment) {
		shipmentService.updateShipment(shipment);

		return new ResponseEntity<>(null);
	}

}
