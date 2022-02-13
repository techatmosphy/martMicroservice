package com.jdr.martMicroservice.bean;

public class ProductUpdateGtinRequest {

	private Long productId;
	
	private Long gtin;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getGtin() {
		return gtin;
	}

	public void setGtin(Long gtin) {
		this.gtin = gtin;
	}
	
	

}
