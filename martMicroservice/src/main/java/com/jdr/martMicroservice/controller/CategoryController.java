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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdr.martMicroservice.entity.Category;
import com.jdr.martMicroservice.pojo.GenericResponse;
import com.jdr.martMicroservice.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/{id}")
	public ResponseEntity<GenericResponse> getCategoryById(@PathVariable Long id) {

		Optional<Category> category = categoryService.getCategory(id);
		GenericResponse response = new GenericResponse();
		if(category.isPresent()) {
		response.setMessage("Category retrieved successfully");
		response.getData().add(category);
		return new ResponseEntity<GenericResponse>(response,HttpStatus.OK);
		}
			response.setError("Category not fo successfully");
		return new ResponseEntity<GenericResponse>(response,HttpStatus.NOT_FOUND);
	}

	@GetMapping
	public ResponseEntity<GenericResponse> getAllCategory() {

		List<Category> categories = categoryService.getAllCategory();
		GenericResponse response = new GenericResponse();
		response.setMessage("Categories retrieved successfully");
		response.getData().addAll(categories);
		return new ResponseEntity<GenericResponse>(response,HttpStatus.OK);
		
	}

	@PostMapping
	public ResponseEntity<GenericResponse> addCategory(@RequestBody Category category) {

		Category cat = categoryService.addCategory(category);
		GenericResponse response = new GenericResponse();
		if(cat != null) {
		response.setMessage("Category created successfully");
		response.getData().add(category);
		return new ResponseEntity<GenericResponse>(response,HttpStatus.CREATED);
		}
			response.setError("Error in creating cateogory ");
		return new ResponseEntity<GenericResponse>(response,HttpStatus.NOT_FOUND);
	}

	@PutMapping
	public ResponseEntity<GenericResponse> updateCategory(@RequestBody Category category) {
		Category cat = categoryService.updateCategory(category);
		GenericResponse response = new GenericResponse();
		if(cat != null) {
		response.setMessage("Category created successfully");
		response.getData().add(category);
		return new ResponseEntity<GenericResponse>(response,HttpStatus.OK);
		}
			response.setError("Error in creating cateogory ");
		return new ResponseEntity<GenericResponse>(response,HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<GenericResponse> deleteCategoryById(@PathVariable Long id) {

		categoryService.deleteCategory(id);
		GenericResponse response = new GenericResponse();
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
