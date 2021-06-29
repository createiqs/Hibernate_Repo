package com.createiq.ems.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.ems.entity.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("com/createiq/ems/config/hibernate.cfg.xml");
		SessionFactory sfFactory = configuration.buildSessionFactory();
		Session session = sfFactory.openSession();
//		session.beginTransaction();
		Employee employee = new Employee("balu", 32000.00, "balu@gmail.com");
		session.save(employee);
//		Employee employee = (Employee) session.get(Employee.class, 1);
//		System.out.println(employee);
		session.beginTransaction().commit();
//		session.getTransaction();
		session.close();
	}

}
