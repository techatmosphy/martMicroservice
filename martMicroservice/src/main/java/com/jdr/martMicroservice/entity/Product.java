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

	@Column(name = "price", nullable = false)
	private Double price;

	@Column(name = "quantity", nullable = false)
	private int quantity;

//    @Column(name = "product_code", nullable = false)
//    private String productCode;

	@Column(name = "gtin", nullable = false)
	private int gtin;

	@Column(name = "offerId", nullable = false)
	private int offerId;

	@Column(name = "brand", nullable = true)
	private String brand;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private Category category;

	@Column(name = "createdDate", nullable = true)
	private Date createdDate;

//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "tax_id")
//    private Tax tax;

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

	public String getBrand() {
		return brand;
	}

	public Category getCategory() {
		return category;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public String getDescription() {
		return description;
	}

	public int getGtin() {
		return gtin;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public String getName() {
		return name;
	}

	public int getOfferId() {
		return offerId;
	}

	public Double getPrice() {
		return price;
	}

	public Long getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public Date getValidTill() {
		return validTill;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setGtin(int gtin) {
		this.gtin = gtin;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

}
