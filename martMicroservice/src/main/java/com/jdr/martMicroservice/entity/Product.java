package com.jdr.martMicroservice.entity;

import java.util.Date;

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
@Table(name = "product")
public class Product extends BaseObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;

	@Column(name = "name", nullable = true)
	private String name;

	@Column(name = "description", nullable = true)
	private String description;

//    @Column(name = "product_code", nullable = false)
//    private String productCode;

	@Column(name = "price", nullable = false)
	private Double price;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "gtin", nullable = false)
	private int gtin;

	@Column(name = "offerId", nullable = false)
	private int offerId;

	@Column(name = "brand", nullable = true)
	private String brand;

//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "tax_id")
//    private Tax tax;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "category_id")
	private Category category;

	@Column(name = "createdDate", nullable = true)
	private Date createdDate;

	@Column(name = "updatedDate", nullable = true)
	private Date updatedDate;

	@Column(name = "validFrom", nullable = true)
	private Date validFrom;

	@Column(name = "validTill", nullable = true)
	private Date validTill;

	@Column(name = "createdBy", nullable = true)
	private String createdBy;

	@Column(name = "lastUpdatedBy", nullable = true)
	private String lastUpdatedBy;

	
	public Product() {
	}

	public Product(Long productId, String name, String description, Double price, int quantity, int gtin, int offerId,
			String brand, Category category, Date createdDate, Date updatedDate, Date validFrom, Date validTill,
			String createdBy, String lastUpdatedBy) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.gtin = gtin;
		this.offerId = offerId;
		this.brand = brand;
		this.category = category;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.validFrom = validFrom;
		this.validTill = validTill;
		this.createdBy = createdBy;
		this.lastUpdatedBy = lastUpdatedBy;
	}
	
	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getGtin() {
		return gtin;
	}

	public void setGtin(int gtin) {
		this.gtin = gtin;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}
