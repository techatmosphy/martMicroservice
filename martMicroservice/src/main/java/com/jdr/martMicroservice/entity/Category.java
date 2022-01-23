package com.jdr.martMicroservice.entity;

import java.util.Date;

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

	private String CreatedBy;

	private Date CreatedDate;

	@Column(name = "description", nullable = false)
	private String description;

	private String LastUpdatedBy;

	@Column(name = "name", nullable = false)
	private String name;

	private Date UpdatedDate;

	private Date ValidFrom;

	private Date ValidTill;

	public Category() {
	}

	public Category(String categoryCode, String name, String description, Date createdDate, Date updatedDate,
			Date validFrom, Date validTill, String createdBy, String lastUpdatedBy) {
		super();
		this.categoryCode = categoryCode;
		this.name = name;
		this.description = description;
		CreatedDate = createdDate;
		UpdatedDate = updatedDate;
		ValidFrom = validFrom;
		ValidTill = validTill;
		CreatedBy = createdBy;
		LastUpdatedBy = lastUpdatedBy;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public String getDescription() {
		return description;
	}

	public String getLastUpdatedBy() {
		return LastUpdatedBy;
	}

	public String getName() {
		return name;
	}

	public Date getUpdatedDate() {
		return UpdatedDate;
	}

	public Date getValidFrom() {
		return ValidFrom;
	}

	public Date getValidTill() {
		return ValidTill;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		LastUpdatedBy = lastUpdatedBy;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUpdatedDate(Date updatedDate) {
		UpdatedDate = updatedDate;
	}
	public void setValidFrom(Date validFrom) {
		ValidFrom = validFrom;
	}
	public void setValidTill(Date validTill) {
		ValidTill = validTill;
	}
}
