package com.jdr.martMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdr.martMicroservice.entity.Category;
import com.jdr.martMicroservice.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/category/{id}")
	public ResponseEntity<Category> getCategory(@PathVariable Long id) {

		Category theCategory = categoryService.getCategory(id);
		return new ResponseEntity<>(theCategory, HttpStatus.OK);
	}

	@GetMapping("/category")
	public ResponseEntity<List<Category>> getAllCategory() {
		
		List<Category> categoryList = categoryService.getAllCategory();		
		return new ResponseEntity<>(categoryList, HttpStatus.OK);
	}

	@PostMapping("/category")
	public ResponseEntity<Category> addCategory(@RequestBody Category category) {

		Category theCategory = categoryService.addCategory(category);
		return new ResponseEntity<>(theCategory , HttpStatus.OK);
	}

	@PutMapping("/category")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category) {

		Category theCategory = categoryService.updateCategory(category);
		return new ResponseEntity<>(theCategory, HttpStatus.OK);
	}

	@DeleteMapping("/category/{id}")
	public ResponseEntity<Object> deleteCategory(@PathVariable Long id) {

		categoryService.deleteCategory(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
