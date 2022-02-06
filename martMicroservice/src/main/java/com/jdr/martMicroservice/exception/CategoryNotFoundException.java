package com.jdr.martMicroservice.exception;

public class CategoryNotFoundException extends RuntimeException {

	private String message;
	
	public CategoryNotFoundException() {
		super();
	}
	
	public CategoryNotFoundException(String message) {
		this.message = message;
	}

}
