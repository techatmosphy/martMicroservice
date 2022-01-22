package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import com.jdr.martMicroservice.entity.Customer;
public interface CustomerService {

	public void deleteCustomer(Long id) ;

	public Customer updateCustomer(Customer customer) ;

	public Customer addCustomer(Customer customer) ;

	public Optional<Customer> getCustomer(Long id) ;
	public List<Customer> getCustomers() ;
}
