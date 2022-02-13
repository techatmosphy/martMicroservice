package com.jdr.martMicroservice.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderRequest {

	private Long mobile;
	
	private List<Long> productIds = new ArrayList<>();
	
	private Double totalAmount;

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}


	public List<Long> getProductIds() {
		return productIds;
	}

	public void setProductIds(List<Long> productIds) {
		this.productIds = productIds;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
