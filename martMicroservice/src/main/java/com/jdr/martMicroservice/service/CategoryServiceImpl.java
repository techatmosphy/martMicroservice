package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.Category;
import com.jdr.martMicroservice.repo.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category getCategory(Long id) {
		return categoryRepository.findById(id).orElse(null);
	}

	@Override
	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Long id) {
		 categoryRepository.deleteById(id);
	}

	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

}
