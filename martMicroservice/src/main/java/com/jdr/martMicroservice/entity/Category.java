package com.jdr.martMicroservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category extends BaseObject {

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long category_id;

	@Column(name = "category_code", nullable = false)
	private String categoryCode;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", nullable = false)
	private String description;

	public Category() {
	}

	public Category(Long category_id, String categoryCode, String name, String description) {
		super();
		this.category_id = category_id;
		this.categoryCode = categoryCode;
		this.name = name;
		this.description = description;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
