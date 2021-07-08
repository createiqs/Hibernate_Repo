package com.createiq.ems.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Address {

	@Id
	@GenericGenerator(name = "myGen", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "myGen")
	private Integer aid;
	private String city;
	private String state;
	private String pin;

	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	private Employee employee;
	

	public Address(String city, String state, String pin, Employee employee) {
		super();
		this.employee = employee;
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

	public Address(Integer aid, String city, String state, String pin) {
		super();
		this.aid = aid;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", state=" + state + ", pin=" + pin + ", employee=" + employee
				+ "]";
	}

}
