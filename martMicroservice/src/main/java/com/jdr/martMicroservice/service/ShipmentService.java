package com.jdr.martMicroservice.service;

import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.Shipment;
public interface ShipmentService {

	Shipment delete();

	Shipment update();

	Shipment add();

	Shipment get();

}
