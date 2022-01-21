package com.jdr.martMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.Customer;
import com.jdr.martMicroservice.repo.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired CustomerRepository CustomerRepository;
	@Override
	public Customer delete() {
		CustomerRepository.delete();
		return null;
	}

	@Override
	public Customer update() {
		CustomerRepository.update();
		return null;
	}

	@Override
	public Customer add() {
		CustomerRepository.add();
		return null;
	}

	@Override
	public Customer get() {
		CustomerRepository.get();
		return null;
	}

}
