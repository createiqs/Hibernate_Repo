package com.createiq.ems.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.ems.entity.Address;
import com.createiq.ems.entity.Employee;

public class OnetoManyMappingTestBiDirectional {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("com/createiq/ems/config/employee.cfg.xml");
		SessionFactory sfFactory = configuration.buildSessionFactory();
		Session session = sfFactory.openSession();

//		Employee emObject = (Employee) session.get(Employee.class, 1);
//		System.out.println(emObject);
//		Employee employee = new Employee();
//
//		Address currentAddres = new Address();
//		currentAddres.setState("Kan");
//		currentAddres.setCity("Beng");
//		currentAddres.setPin("300038");
//		currentAddres.setEmployee(employee);
////
//		Address permineentAddres = new Address();
//		permineentAddres.setState("vengal rao nagar");
//		permineentAddres.setCity("hyd");
//		permineentAddres.setPin("500038");
//		permineentAddres.setEmployee(employee);
//
//		List<Address> addAll = new ArrayList<Address>();
//		addAll.add(currentAddres);
//		addAll.add(permineentAddres);
////
//		employee.setName("balu");
//		employee.setSal(32000.00);
//		employee.setEmail("balu@gmail.com");
//		employee.setJoiningDate(new Date());
//		employee.setAddress(addAll);
//		session.save(employee);
//		session.beginTransaction().commit();
//		session.close();
//
//		Address address=(Address) session.get(Address.class, 1);
//		System.out.println(address);
		Employee employee = (Employee) session.get(Employee.class, 1);
//		System.out.println(employee.getName());
		System.out.println(employee.getAddress());
	}

}
