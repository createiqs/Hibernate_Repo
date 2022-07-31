package org.ciq.ems.entity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeClient {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sfFactory = configuration.buildSessionFactory();
		Session session = sfFactory.openSession();
		System.out.println(session);
		Query query = session.createQuery("from Employee");
		List<Employee> employees = query.list();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
//
//		session.close();
		
//		Employee employee=(Employee) session.get(Employee.class, 1);
//		System.out.println(employee);
//		Transaction tx = session.beginTransaction();
//		Employee employee=new Employee(100,"charvy", 45000.00, "charvy@gmail.com");
//		session.save(employee);
//		tx.commit();
//		session.close();	
		
	}
}
