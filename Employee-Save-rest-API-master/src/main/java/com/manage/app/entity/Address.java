package com.manage.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
 public class Address {
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
     private Long id;
	 private int Street ;
	 private String City;
	 private String state;
	 private long postalcode;
	 private String country;
	 
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getStreet() {
		return Street;
	}

	public void setStreet(int street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(long postalcode) {
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address(Long id, int street, String city, String state, long postalcode, String country) {
		super();
		this.id = id;
		Street = street;
		City = city;
		this.state = state;
		this.postalcode = postalcode;
		this.country = country;
	}
	
		

	}