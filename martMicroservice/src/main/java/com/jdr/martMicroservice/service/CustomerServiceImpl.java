package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.Customer;
import com.jdr.martMicroservice.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository CustomerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		return CustomerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		CustomerRepository.deleteById(id);
	}

	@Override
	public Optional<Customer> getCustomer(Long id) {
		return CustomerRepository.findById(id);
	}

	@Override
	public List<Customer> getCustomers() {
		return CustomerRepository.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return CustomerRepository.save(customer);
	}
}
