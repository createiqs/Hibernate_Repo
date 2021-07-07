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
		address.setCity("Hyd");
		address.setState("Ts");
		address.setPin("500038");
		address.setEmployee(employee);
		employee.setName("balu");
		employee.setSal(32000.00);
		employee.setEmail("balu@gmail.com");
		employee.setJoiningDate(new Date());
		employee.setAddress(address);

		session.save(address);
		session.save(employee);
		session.beginTransaction().commit();
		session.close();

	}

}
