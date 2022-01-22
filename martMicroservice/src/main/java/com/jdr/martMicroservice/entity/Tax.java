package com.jdr.martMicroservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tax")
public class Tax extends BaseObject{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

    @Column(name = "hsn_code", nullable = false)
    private String hsnCode;

    @Column(name = "tax_percentage", nullable = false)
    private float taxPercentage;

    @Column(name = "tax_description", nullable = false)
    private String taxDescription;
}
