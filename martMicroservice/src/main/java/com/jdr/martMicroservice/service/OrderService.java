package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import com.jdr.martMicroservice.bean.OrderRequest;
import com.jdr.martMicroservice.entity.Order;
public interface OrderService {


	Order addOrder(OrderRequest order);

	void deleteOrder(Long id);

	Optional<Order> getOrder(Long id);

	List<Order> getOrders();

	Order updateOrder(Order order);

}
