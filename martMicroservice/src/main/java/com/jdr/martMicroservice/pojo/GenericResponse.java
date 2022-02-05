package com.jdr.martMicroservice.pojo;

import java.util.ArrayList;
import java.util.List;

public class GenericResponse {
	
	private String message;
	
	private List<Object> data = new ArrayList<>();
	
	private String error;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
}
