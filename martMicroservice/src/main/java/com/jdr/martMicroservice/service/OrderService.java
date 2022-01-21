package com.jdr.martMicroservice.service;

import com.jdr.martMicroservice.entity.Order;
public interface OrderService {

	Order get();

	Order add();

	Order update();

	Order delete();

}
