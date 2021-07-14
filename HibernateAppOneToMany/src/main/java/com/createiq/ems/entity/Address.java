package com.createiq.ems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@SequenceGenerator(name = "emp_seq", initialValue = 1, allocationSize = 1, sequenceName = "address_seq")
	private Integer aid;
	private String city;
	private String state;
	private String pin;

//	

	public Address(String city, String state, String pin) {
		super();
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

//	@Override
//	public String toString() {
//		return "Address [aid=" + aid + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
//	}

}
