package org.ciq.ems.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "account_number", nullable = false, unique = true)
	private Long accontNumber;
	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@OneToOne(mappedBy = "account")
	private Employee employee;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int id, Long accontNumber, String city, String state) {
		super();
		this.id = id;
		this.accontNumber = accontNumber;
		this.city = city;
		this.state = state;
	}

	public Account(Long accontNumber, String city, String state) {
		super();
		this.accontNumber = accontNumber;
		this.city = city;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getAccontNumber() {
		return accontNumber;
	}

	public void setAccontNumber(Long accontNumber) {
		this.accontNumber = accontNumber;
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
		return "Account [id=" + id + ", accontNumber=" + accontNumber + ", city=" + city + ", state=" + state + "]";
	}

}
