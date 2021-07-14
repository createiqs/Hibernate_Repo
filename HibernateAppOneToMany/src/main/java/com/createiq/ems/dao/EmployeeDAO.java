package com.createiq.ems.dao;

import java.util.List;

import com.createiq.ems.entity.Employee;

public interface EmployeeDAO {

	void save(Employee employee);

	void update(Employee employee);

	void delete(int id);

	void findById(int id);

	List<Employee> getAllEmps();

}
