package com.createiq.ems.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

@Entity
@Table( name = "emp_one")
public class Employee {

	@Id
//	@GenericGenerator(name = "emp_seq", strategy = "emp_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@SequenceGenerator(name = "emp_seq", initialValue = 1, allocationSize = 1, sequenceName = "emp_seq")
	private Integer id;
	@Column
	private String name;
	@Column
	private Double sal;
//	@Column(unique = true)
	private String email;
	@Column(unique = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date joiningDate;
//	private byte[] empImage;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "employee")
	@JoinTable(name = "emp_add_table",joinColumns = (@))
	private List<Address> address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Double sal, String email, Date joiningDate, List<Address> address) {
		super();
		this.name = name;
		this.sal = sal;
		this.email = email;
		this.joiningDate = joiningDate;
		this.address = address;
	}

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

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", email=" + email + ", joiningDate="
				+ joiningDate + ", address=" + address + "]";
	}

}
