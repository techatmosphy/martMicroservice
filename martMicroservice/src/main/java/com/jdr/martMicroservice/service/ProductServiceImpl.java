package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.jdr.martMicroservice.entity.Product;
import com.jdr.martMicroservice.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void deleteProduct(@PathVariable Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> getProduct(Long id) {
		return productRepository.findById(id);

	}

	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();

	}

}
