package com.jdr.martMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdr.martMicroservice.entity.Category;
import com.jdr.martMicroservice.repo.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category get() {

		categoryRepository.get();
		return null;
	}

	@Override
	public Category update() {
		categoryRepository.update();
		return null;
	}

	@Override
	public Category delete() {
		categoryRepository.delete();
		return null;
	}

	@Override
	public Category add() {
		categoryRepository.add();
		return null;
	}

}
