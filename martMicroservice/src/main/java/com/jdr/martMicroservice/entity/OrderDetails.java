package com.jdr.martMicroservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderDetails")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long OrderDetailsId;
	
	private Long orderId;

	Double unitPrice;
	Integer quantity;
	Double discount;
	public Long getOrderDetailsId() {
		return OrderDetailsId;
	}
	public void setOrderDetailsId(Long orderDetailsId) {
		OrderDetailsId = orderDetailsId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderid) {
		orderId = orderid;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	
}
