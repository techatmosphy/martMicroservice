package com.jdr.martMicroservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address extends BaseObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "ADDRESS1", nullable = false)
	private String address1;

	@Column(name = "ADDRESS2", nullable = true)
	private String address2;

	@Column(name = "CITY", nullable = false)
	private String city;

	@Column(name = "STATE", nullable = false)
	private String state;

	@Column(name = "COUNTRY", nullable = false)
	private String country;

	@Column(name = "LANDMARK", nullable = true)
	private String landmark;

	@Column(name = "MOBILE", nullable = false)
	private String mobile;

	public Address() {
	}

	public Address(Long id, String address1, String address2, String city, String state, String country,
			String landmark, String mobile) {
		super();
		this.id = id;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.landmark = landmark;
		this.mobile = mobile;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public Long getId() {
		return id;
	}

	public String getLandmark() {
		return landmark;
	}

	public String getMobile() {
		return mobile;
	}

	public String getState() {
		return state;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setState(String state) {
		this.state = state;
	}
}
