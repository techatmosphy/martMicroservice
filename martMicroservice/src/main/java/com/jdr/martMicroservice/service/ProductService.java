package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import com.jdr.martMicroservice.entity.Product;
public interface ProductService {

	void deleteProduct(Long id);

	Product addProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getProducts();

	Optional<Product> getProduct(Long id);

	
}
