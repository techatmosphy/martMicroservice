package com.jdr.martMicroservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//extends BaseObject
@Entity
@Table(name = "category")
public class Category  {
	
	


	
	@Id()
	@Column(name = "category_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long categoryId;

	@Column(name = "category_code", nullable = false)
	private String categoryCode;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", nullable = false)
	private String description;

	//@OneToOne(mappedBy = "category")
	// Product product;
	
	private String createdBy;

	private Date createdDate;
	
	private Date updatedDate;

	private Date validFrom;

	private Date validTill;
	
	public Category(Long categoryId, String categoryCode, String name, String description, String createdBy,
			Date createdDate, Date updatedDate, Date validFrom, Date validTill) {
		super();
		this.categoryId = categoryId;
		this.categoryCode = categoryCode;
		this.name = name;
		this.description = description;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.validFrom = validFrom;
		this.validTill = validTill;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTill() {
		return validTill;
	}

	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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
