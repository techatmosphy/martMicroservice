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
public class Product extends BaseObject{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private double productId;
	
	@Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

//    @Column(name = "product_code", nullable = false)
//    private String productCode;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "quantity", nullable = false )
    private int quantity;

    @Column(name = "gtin", nullable = false )
    private int gtin;

    @Column(name = "offerId", nullable = false )
    private int offerId;

    @Column(name = "brand", nullable = false )
    private String brand;

//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "tax_id")
//    private Tax tax;


    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;
    

    @Column(name = "createdDate", nullable = false )
    private Date createdDate;


    @Column(name = "updatedDate", nullable = false )
    private Date updatedDate;
   
    @Column(name = "validFrom", nullable = false )
    private Date validFrom;
    
    @Column(name = "validTill", nullable = false )
    private Date validTill;

    @Column(name = "createdBy", nullable = false )
    private String createdBy;

    @Column(name = "lastUpdatedBy", nullable = false )
    private String lastUpdatedBy;
}
