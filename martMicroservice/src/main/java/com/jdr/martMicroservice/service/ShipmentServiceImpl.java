package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.Shipment;
import com.jdr.martMicroservice.repo.ShipmentRepository;

@Service
public class ShipmentServiceImpl implements ShipmentService {

	@Autowired
	ShipmentRepository shipmentRepository;

	@Override
	public Shipment addShipment(Shipment shipment) {
		return shipmentRepository.save(shipment);
	}

	@Override
	public void deleteShipment(Long id) {
		shipmentRepository.deleteById(id);
	}

	@Override
	public Shipment updateShipment(Shipment shipment) {
		return shipmentRepository.save(shipment);
	}

	@Override
	public Optional<Shipment> getShipment(Long id) {
		return shipmentRepository.findById(id);
	}

	@Override
	public List<Shipment> getShipments() {
		return shipmentRepository.findAll();
	}
}
