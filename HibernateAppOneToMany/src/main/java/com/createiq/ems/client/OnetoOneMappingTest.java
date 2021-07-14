package com.createiq.ems.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.ems.entity.Address;
import com.createiq.ems.entity.Employee;

public class OnetoOneMappingTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("com/createiq/ems/config/employee.cfg.xml");
		SessionFactory sfFactory = configuration.buildSessionFactory();
		Session session = sfFactory.openSession();
//		Transaction transaction=session.beginTransaction().begin();
		Employee employee = new Employee();
		Address address = new Address();
		address.setCity("Bang");
		address.setState("Kan");
//		address.setPin("300038");
//		address.setEmployee(employee);
//		employee.setName("Raj");
//		employee.setSal(22000.00);
//		employee.setEmail("Raj@gmail.com");
//		employee.setJoiningDate(new Date());
//		employee.setAddress(address);
		System.out.println(session.isConnected());
//		session.save(employee);
//		session.flush();
		session.persist(employee);
//		session.save(address);
		session.beginTransaction().commit();
		session.close();
		System.out.println(session.isConnected());

	}

}
