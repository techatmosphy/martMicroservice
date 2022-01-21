package com.jdr.martMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.Product;
import com.jdr.martMicroservice.repo.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product delete() {
		productRepository.delete();
		return null;
	}

	@Override
	public Product update() {
		productRepository.update();
		return null;
	}

	@Override
	public Product add() {
		productRepository.add();
		return null;
	}

	@Override
	public Product get() {
		productRepository.get();
		return null;
	}

}
