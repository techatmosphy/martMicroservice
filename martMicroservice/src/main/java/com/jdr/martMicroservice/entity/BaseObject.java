package com.jdr.martMicroservice.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@JsonIgnore
	@Column(name = "is_deleted")
	private boolean deleted;

	@JsonIgnore
	@Column(name = "date_created")
	private Timestamp dateCreated = new Timestamp(System.currentTimeMillis());

	@JsonIgnore
	@Column(name = "date_modified", nullable = true)
	private Timestamp dateModified;

	transient String flowType;

}
