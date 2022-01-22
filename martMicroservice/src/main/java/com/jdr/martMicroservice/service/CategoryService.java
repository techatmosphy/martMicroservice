package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import com.jdr.martMicroservice.entity.Category;

public interface CategoryService {

	public Optional<Category> getCategory(Long id);

	public List<Category> getAllCategory();

	public Category updateCategory(Category category);

	public void deleteCategory(Long id);

	public Category addCategory(Category category);

}
