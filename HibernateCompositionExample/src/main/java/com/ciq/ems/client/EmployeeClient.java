package com.ciq.ems.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ciq.ems.entity.Address;
import com.ciq.ems.entity.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sfFactory = configuration.buildSessionFactory();
		Session session = sfFactory.openSession();
		System.out.println(session);
		Transaction tx = session.beginTransaction();
		Address address = new Address(1245, "Hyd", "TS");
		Employee employee = new Employee("anil", 42000.00, address);
		session.save(employee);
//		Employee employee = (Employee) session.get(Employee.class, 1);
//		System.out.println(employee);
		tx.commit();
		session.close();

	}

}
