package com.jdr.martMicroservice.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.bean.OrderRequest;
import com.jdr.martMicroservice.entity.Order;
import com.jdr.martMicroservice.entity.Product;
import com.jdr.martMicroservice.repo.OrderRepository;
import com.jdr.martMicroservice.repo.ProductRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Order addOrder(OrderRequest orderRequest) {
		List<Product> productList = productRepository.findAllById(orderRequest.getProductIds());
		Set<Product> products = new HashSet<>(productList);
		Order order = new Order();
		order.setMobile(orderRequest.getMobile());
		order.setProducts(products);
		order.setTotalAmount(orderRequest.getTotalAmount());
		return orderRepository.save(order);
	}

	@Override
	public void deleteOrder(Long id) {
		orderRepository.deleteById(id);
	}

	@Override
	public Optional<Order> getOrder(Long id) {
		return orderRepository.findById(id);
	}

	@Override
	public List<Order> getOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Order updateOrder(Order order) {
		return orderRepository.save(order);
	}

}
