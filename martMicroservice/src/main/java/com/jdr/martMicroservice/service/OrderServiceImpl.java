package com.jdr.martMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.Order;
import com.jdr.martMicroservice.repo.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired OrderRepository orderRepository;
	@Override
	public Order get() {
		orderRepository.get();
		return null;
	}

	@Override
	public Order add() {
		orderRepository.add();
		return null;
	}

	@Override
	public Order update() {
		orderRepository.update();
		return null;
	}

	@Override
	public Order delete() {
		orderRepository.delete();
		return null;
	}

}
