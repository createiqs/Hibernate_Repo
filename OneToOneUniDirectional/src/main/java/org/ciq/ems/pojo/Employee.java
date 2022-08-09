package org.ciq.ems.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "salary", nullable = false)
	private double salary;

//	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE} )
//	@JoinColumn(name = "ACCOUNT_ID")
	@OneToOne(cascade = CascadeType.ALL )
	 @JoinTable(name = "EMPLOYEE_ACCCOUNT",
     joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
     inverseJoinColumns = @JoinColumn(name = "ACCOUNT_ID"))
	private Account account;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.account = account;
	}

	public Employee(String name, double salary, Account account) {
		super();
		this.name = name;
		this.salary = salary;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", account=" + account + "]";
	}

}
