package com.sts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Student {
	@Id
	//@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String address;
	private String mobile;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
	
	

/*
	public Student(String id, String name, String address, String mobile) {
		super();
		this.Id = id;
		this.Name = name;
		this.Address = address;
		this.Mobile = mobile;
	} */


	
	
	
	
}
