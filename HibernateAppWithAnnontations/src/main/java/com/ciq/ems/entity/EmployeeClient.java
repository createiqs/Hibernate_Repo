package com.ciq.ems.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeClient {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sfFactory = configuration.buildSessionFactory();
		Session session = sfFactory.openSession();
//		System.out.println(session);

//		Employee employee = new Employee("charvy", 15000.00, "charvy@gmail.com");
//		Transaction tx = session.beginTransaction();
//		tx.commit();

//		Employee employee = new Employee("anil", 15000.00, "anil@gmail.com");
//		session.save(employee);
//		session.beginTransaction().commit();
//		session.close();

//		Employee employee=(Employee)session.get(Employee.class, 1);
//		System.out.println(employee);
//		
//		Employee employee2=(Employee) session.load(Employee.class, 2);
//		System.out.println(employee2);

//		Employee employee = new Employee(2, "anil b", 25000.00, "anilb@gmail.com");
//		session.update(employee);
//		session.beginTransaction().commit();
//		session.close();

		Employee employee = new Employee(3, "navya", 44000.00, "navya@gmail.com");

		session.saveOrUpdate(employee);

		session.beginTransaction().commit();

		session.close();

	}

}
