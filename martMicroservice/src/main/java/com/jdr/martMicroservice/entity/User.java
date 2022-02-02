package com.jdr.martMicroservice.entity;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name =  "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String email;
	
	private String password;

	private String panNumber;
	private String mobileNumber;
	private String aadharNumber;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(
		            name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
				            name = "role_id", referencedColumnName = "id"))
	
	private Collection<Role> roles;

	public User() {
		
	}

	public User(String firstName, String lastName, String email, String aadharNumber,String mobileNumber,
			String panNumber, String password, Collection<Role> roles) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.aadharNumber = aadharNumber;
		this.mobileNumber = mobileNumber;
		this.panNumber = panNumber;
		this.password = password;
		this.roles = roles;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}
	public long getId() {
		return id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}


	public String getPanNumber() {
	return panNumber;
	}
	public String getPassword() {
		return password;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

}
