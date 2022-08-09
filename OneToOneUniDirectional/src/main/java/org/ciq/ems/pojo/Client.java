package org.ciq.ems.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sfFactory = configuration.buildSessionFactory();
		Session session = sfFactory.openSession();
//		System.out.println(session);
//		Account account = new Account(202208099L, "hyd", "ts");
		Account account = new Account(202108100L, "hyd", "ts");
		Employee employee = new Employee("anil", 45000.00, account);
//		Employee employee = new Employee("chiru", 55000.00, account);
		session.persist(account);
		session.persist(employee);
//		Employee employee = (Employee) session.get(Employee.class, 2);
		System.out.println(employee);
//		session.delete(employee);
		session.beginTransaction().commit();
		session.close();

	}

}
