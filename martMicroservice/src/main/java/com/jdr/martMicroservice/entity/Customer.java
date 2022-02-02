package com.jdr.martMicroservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer extends BaseObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@Column(name = "customer_code", nullable = false)
	private String customerCode;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public Customer() {
	}

	public Customer(Long customerId, String fullName, String customerCode, User user) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.customerCode = customerCode;
		this.user = user;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public User getUser() {
		return user;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
