package com.jdr.martMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.Shipment;
import com.jdr.martMicroservice.repo.ShipmentRepository;
@Service
public class ShipmentServiceImpl implements ShipmentService{

	@Autowired ShipmentRepository shipmentRepository;
	@Override
	public Shipment delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shipment update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shipment add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shipment get() {
		// TODO Auto-generated method stub
		return null;
	}

}
