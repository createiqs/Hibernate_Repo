package com.createiq.ems.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import com.createiq.ems.entity.Employee;

public class HqlTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("com/createiq/ems/config/hibernate.cfg.xml");
		SessionFactory sfFactory = configuration.buildSessionFactory();
//		System.out.println(sfFactory);
		Session session = sfFactory.openSession();
//		Employee employee = (Employee) session.createQuery("select e.esal, e.ename from Employee e").uniqueResult();
//		List<Employee> lists = new ArrayList<>();
//		lists.add(employee);
//		System.out.println(lists);

//		Criteria criteria = session.createCriteria(Employee.class);
//		Criterion expression = Restrictions.eq("ename", "balu");
//		criteria.add(expression);
//		List<Employee> empDetails = criteria.list();
//		for (Employee employee : empDetails) {
//			System.out.println(empDetails);
//		}

		List<Employee> employee = session.createCriteria(Employee.class).add(Restrictions.eq("ename", "balu")).list();
		for (Employee employee2 : employee) {
			System.out.println(employee2);
		}

	}

}
