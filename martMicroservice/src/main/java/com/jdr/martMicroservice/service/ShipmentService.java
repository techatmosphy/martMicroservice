package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import com.jdr.martMicroservice.entity.Shipment;
public interface ShipmentService {

	Shipment addShipment(Shipment shipment);

	void deleteShipment(Long id);

	Optional<Shipment> getShipment(Long id);

	List<Shipment> getShipments();

	Shipment updateShipment(Shipment shipment);



}
