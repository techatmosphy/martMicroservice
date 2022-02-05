package com.jdr.martMicroservice.service;

import java.util.List;
import java.util.Optional;

import com.jdr.martMicroservice.entity.Category;

public interface CategoryService {

	public Category addCategory(Category category);

	public void deleteCategory(Long id);

	public List<Category> getAllCategory();

	public Optional<Category> getCategory(Long id);

	public Category updateCategory(Category category);

}
