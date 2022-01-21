package com.jdr.martMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdr.martMicroservice.entity.Category;
import com.jdr.martMicroservice.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<Object> get() {

		categoryService.get();
		return null;

	}

	@PostMapping
	public ResponseEntity<Object> add(@RequestBody Category category) {

		categoryService.add();
		return new ResponseEntity<>(null);
	}

	@PutMapping
	public ResponseEntity<Object> update(@RequestBody Category category) {

		categoryService.update();
		return new ResponseEntity<>(null);
	}

	@DeleteMapping
	public ResponseEntity<Object> delete(@RequestBody Category category) {

		categoryService.delete();
		return new ResponseEntity<>(null);
	}
}
