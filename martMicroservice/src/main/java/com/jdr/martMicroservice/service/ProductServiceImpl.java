package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.jdr.martMicroservice.bean.ProductRequest;
import com.jdr.martMicroservice.entity.Category;
import com.jdr.martMicroservice.entity.Product;
import com.jdr.martMicroservice.exception.CategoryNotFoundException;
import com.jdr.martMicroservice.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryService categoryService;

	@Override
	public Product addProduct(ProductRequest productRequest) {
		Long categoryId =productRequest.getCategoryId();
		Optional<Category> category = categoryService.getCategory(categoryId);
		if(! category.isPresent()) {
			throw new CategoryNotFoundException("Category not found with Id :"+categoryId);
		}

		Product product = new Product();
		product.setName(productRequest.getName());
		product.setPrice(productRequest.getPrice());
		product.setDescription(productRequest.getDescription());
		product.setProductCode(productRequest.getName());
		product.setStockCount(12l);
		product.setCategory(category.get());
		
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(@PathVariable Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Optional<Product> getProduct(Long id) {
		return productRepository.findById(id);

	}

	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();

	}

	@Override
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

}
