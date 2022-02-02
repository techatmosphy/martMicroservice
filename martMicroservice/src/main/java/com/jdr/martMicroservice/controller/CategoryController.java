package com.jdr.martMicroservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping("/category")
	public ResponseEntity<Object> addCategory(@RequestBody Category category) {

		Category RespCategory=categoryService.addCategory(category);
		return new ResponseEntity<>(RespCategory,HttpStatus.OK);
	}

	@DeleteMapping("/category/{id}")
	public ResponseEntity<Object> deleteCategory(@PathVariable Long id) {

		categoryService.deleteCategory(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/category")
	public ResponseEntity<Object> getAllCategory() {

		List<Category> category=categoryService.getAllCategory();
		return new ResponseEntity<>(category,HttpStatus.OK);
	}

	@GetMapping("/category/{id}")
	public ResponseEntity<Object> getCategory(@PathVariable Long id) {

		Optional<Category> category=categoryService.getCategory(id);
		return new ResponseEntity<>(category,HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Object> updateCategory(@RequestBody Category category) {

		Category RespCategory=categoryService.updateCategory(category);
		return new ResponseEntity<>(RespCategory,HttpStatus.OK);
	}
}
