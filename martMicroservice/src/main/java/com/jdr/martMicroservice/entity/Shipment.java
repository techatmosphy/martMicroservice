package com.jdr.martMicroservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipment")
public class Shipment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;

}
