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
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public List<Category> getAllCategory() {

		return categoryRepository.findAll();
	}

	@Override
	public Optional<Category> getCategory(Long id) {

		return categoryRepository.findById(id);
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}

}
