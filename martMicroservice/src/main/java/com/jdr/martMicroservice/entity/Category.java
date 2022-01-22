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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long category_id;

	@Column(name = "category_code", nullable = false)
	private String categoryCode;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", nullable = false)
	private String description;
}
