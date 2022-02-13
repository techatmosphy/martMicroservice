package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import com.jdr.martMicroservice.bean.ProductRequest;
import com.jdr.martMicroservice.entity.Product;
public interface ProductService {

	Product addProduct(ProductRequest product);

	void deleteProduct(Long id);

	Optional<Product> getProduct(Long id);

	List<Product> getProducts();

	Product updateProduct(ProductRequest product);
	
	void updateGtin(Long productId, Long gtin);
	
	Product getProductByGtin(Long gtin);
	
	void deleteAll();
	
	

	
}
