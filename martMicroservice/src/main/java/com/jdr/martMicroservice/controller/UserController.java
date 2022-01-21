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

import com.jdr.martMicroservice.entity.User;
import com.jdr.martMicroservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired UserService userService;
	@GetMapping
	public ResponseEntity<Object> get(@RequestBody User User) {

		userService.get();
		return new ResponseEntity<>(null);
	}

	@PostMapping
	public ResponseEntity<Object> add(@RequestBody User User) {

		userService.add();
		return new ResponseEntity<>(null);
	}

	@PutMapping
	public ResponseEntity<Object> update(@RequestBody User User) {

		userService.update();
		return new ResponseEntity<>(null);
	}

	@DeleteMapping
	public ResponseEntity<Object> delete(@RequestBody User User) {

		userService.delete();
		return new ResponseEntity<>(null);
	}
}
