package com.jdr.martMicroservice.service;

import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.Customer;
public interface CustomerService {

	public Customer delete() ;

	public Customer update() ;

	public Customer add() ;

	public Customer get() ;
}
