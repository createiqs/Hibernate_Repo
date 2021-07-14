package com.createiq.ems.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.ems.entity.Address;
import com.createiq.ems.entity.Employee;

import oracle.net.aso.p;

public class OnetoManyMappingTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("com/createiq/ems/config/employee.cfg.xml");
		SessionFactory sfFactory = configuration.buildSessionFactory();
		Session session = sfFactory.openSession();

//		Employee emObject = (Employee) session.get(Employee.class, 1);
//		System.out.println(emObject);
//		Transaction transaction=session.beginTransaction().begin();
//		Employee employee = new Employee();
//
//		Address currentAddres = new Address();
//		currentAddres.setState("Kan");
//		currentAddres.setCity("Beng");
//		currentAddres.setPin("300038");
//
//		Address permineentAddres = new Address();
//		permineentAddres.setState("vengal rao nagar");
//		permineentAddres.setCity("hyd");
//		permineentAddres.setPin("500038");
//
//		List<Address> addAll = new ArrayList<Address>();
//		addAll.add(currentAddres);
//		addAll.add(permineentAddres);
//
//		employee.setName("balu");
//		employee.setSal(32000.00);
//		employee.setEmail("balu@gmail.com");
//		employee.setJoiningDate(new Date());
//		employee.setAddress(addAll);

//		session.save(employee);
//		session.beginTransaction().commit();
//		session.close();
//		System.out.println(session.isConnected());

//		Employee employee1 = (Employee) session.get(Employee.class, 1);
//		System.out.println(employee1);

		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> employees = criteria.list();
		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
