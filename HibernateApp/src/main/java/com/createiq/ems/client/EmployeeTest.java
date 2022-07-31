package com.createiq.ems.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.createiq.ems.entity.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("employee.cfg.xml");
		SessionFactory sfFactory = configuration.buildSessionFactory();
		Session session = sfFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee("kishore", 32000.00, "kishore@gmail.com");
		session.save(employee);
		transaction.commit();
		session.close();
		System.out.println(employee);
//		Employee employee = (Employee) session.get(Employee.class, 1);
////		System.out.println(employee);
////		session.getTransaction().commit();
////		session.beginTransaction().commit();
//		Employee employee = (Employee) session.load(Employee.class, 1);
//		System.out.println(employee);
//		System.out.println(session.isConnected());
//		session.close();
//		System.out.println(session.isConnected());

//		EmployeeDAO dao = new EmployeeDaoImpl();
//		dao.findById(1);
//		dao.save(employee);
//		List<Employee> allEmps = dao.getAllEmps();
//		for (Employee employee : allEmps) {
//			System.out.println(employee);
//		}

	}

}
