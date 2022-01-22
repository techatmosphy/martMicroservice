package com.jdr.martMicroservice.controller;

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
	public ResponseEntity<Object> getCategory(@PathVariable Long id) {

		categoryService.getCategory(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/category")
	public ResponseEntity<Object> getAllCategory() {

		categoryService.getAllCategory();
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/category")
	public ResponseEntity<Object> addCategory(@RequestBody Category category) {

		categoryService.addCategory(category);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Object> updateCategory(@RequestBody Category category) {

		categoryService.updateCategory(category);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/category/{id}")
	public ResponseEntity<Object> deleteCategory(@PathVariable Long id) {

		categoryService.deleteCategory(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
