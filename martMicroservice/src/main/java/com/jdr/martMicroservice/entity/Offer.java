package com.jdr.martMicroservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offer")
public class Offer extends BaseObject {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int offerId;
	
	@Column(name = "offer_code", nullable = false)
	private String offerCode;

	@Column(name = "offer_name", nullable = false)
	private String offerName;

	@Column(name = "offer_description", nullable = false)
	private String offerDescription;

	@Column(name = "status", nullable = false)
	private String status;
}
