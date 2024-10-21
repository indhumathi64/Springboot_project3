package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cusId;
	
	@Column(name = "cus_name")
	private String cusName;
	
	@Column(name = "cus_mobile")
	private String mobile;
	
	@Column(name ="cus_location")
	private String location;
	
	
	public Customer () {
	

}


	public Customer(int cusId, String cusName, String mobile, String location) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.mobile = mobile;
		this.location = location;
	}


	public int getCusId() {
		return cusId;
	}


	public void setCusId(int cusId) {
		this.cusId = cusId;
	}


	public String getCusName() {
		return cusName;
	}


	public void setCusName(String cusName) {
		this.cusName = cusName;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", mobile=" + mobile + ", location=" + location
				+ ", getCusId()=" + getCusId() + ", getCusName()=" + getCusName() + ", getMobile()=" + getMobile()
				+ ", getLocation()=" + getLocation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}