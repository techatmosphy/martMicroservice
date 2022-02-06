package com.jdr.martMicroservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jdr.martMicroservice.bean.GenericResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	 @ExceptionHandler(CategoryNotFoundException.class)
	    public ResponseEntity<GenericResponse> handleExceptions( CategoryNotFoundException exception) {
		    GenericResponse response = new GenericResponse();
		    response.setMessage(exception.getMessage());
	        return  new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	    }

}
