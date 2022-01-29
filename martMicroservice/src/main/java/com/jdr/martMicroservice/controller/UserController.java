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

import com.jdr.martMicroservice.entity.User;
import com.jdr.martMicroservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/user/{id}")
	public ResponseEntity<Object> getUser(@PathVariable Long id) {

		userService.getUser(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/user")
	public ResponseEntity<Object> getUsers() {

		userService.getUsers();
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/user")
	public ResponseEntity<Object> addUser(@RequestBody User user) {

		userService.addUser(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/user")
	public ResponseEntity<Object> updateUser(@RequestBody User user) {

		userService.updateUser(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable Long id) {

		userService.deleteUser(id);
		return new ResponseEntity<>(null);
	}
}
