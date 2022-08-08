package com.ciq.ems.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private int doorNo;
	private String city;
	private String state;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int doorNo, String city, String state) {
		super();
		this.doorNo = doorNo;
		this.city = city;
		this.state = state;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
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

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", city=" + city + ", state=" + state + "]";
	}

}
