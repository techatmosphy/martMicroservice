package com.jdr.martMicroservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public ResponseEntity<String> getHome() {

		return new ResponseEntity<>("Thanks, You Are Welocme to JDR Store Service", HttpStatus.OK);
	}

}
