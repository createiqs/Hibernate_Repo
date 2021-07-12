package com.vidvaan.hibernate.client;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Distinct;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.vidvaan.hibernate.entity.Person;

import oracle.net.aso.p;

public class PersonCriteriaTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		SessionFactory seFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = seFactory.openSession();
		System.out.println(seFactory.openSession());

		// criteria api
//only for selecting data from database using complete object
		// for non partial objects we go for projections and criteria

		// we can't perform non select operations for criteria
		// it is also used for executing dynamic sql queries also in the case of
		// hql we used select and non select queries

//		Criteria criteria = session.createCriteria(Person.class);
//		List<Person> persons = criteria.list();
//		for (Person person : persons) {
//			System.out.println(person);
//		}

//		Criteria criteria = session.createCriteria(Person.class);
//		 Criterion cn=Restrictions.eq("pid", 100);
//		 criteria.add(cn);
//		 Person person = (Person) criteria.uniqueResult();
//		 System.out.println(person);

//		Criteria criteria = session.createCriteria(Person.class);
//		criteria.setProjection(Projections.property("firstName"));
//		criteria.setProjection(Projections.property("gender"));
//		List<String> names = criteria.list();
//		for (String objects : names) {
//			System.out.println(objects);
//		}
//		
//		Criteria criteria = session.createCriteria(Person.class);
//		ProjectionList pList = Projections.projectionList();
//		pList.add(Projections.property("firstName"));
//		pList.add(Projections.property("gender"));
//		criteria.setProjection(pList);
//		List<Object[]> names = criteria.list();
//		for (Object[] objects : names) {
//			System.out.println(objects[0]);
//			System.out.println(objects[1]);
//		}

		Criteria criteria = session.createCriteria(Person.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.property("firstName"));
		pList.add(Projections.property("gender"));
		pList.add(Projections.property("country"));
		criteria.setProjection(pList);
		List<Object[]> names = criteria.list();
		for (Object[] objects : names) {
			System.out.println(Arrays.toString(objects));
		}

		// group by

//		Criteria criteria = session.createCriteria(Person.class);
//		ProjectionList pList = Projections.projectionList();
//		pList.add(Projections.groupProperty("country"));
//		pList.add(Projections.count("pid"));
////		pList.add(Projections.property("pid"));
//		pList.add(Projections.property("lastName"));
//		pList.add(Projections.property("firstName"));
//		criteria.setProjection(pList);
//		List<Object[]> list = criteria.list();
//		for (Object[] objects : list) {
//			System.out.println(objects[0]);
//			System.out.println(objects[1]);
//			System.out.println(objects[2]);
//			System.out.println(objects[3]);
//		}\

//		Criteria criteria = session.createCriteria(Person.class).add(Restrictions.like("country", "%Germany%"))
//				.addOrder(Order.asc("firstName"));
//		List<Person> persons = criteria.list();
//		for (Person person : persons) {
//			System.out.println(person);
//		}

//		session.createCriteria(Person.class).add(Restrictions.like("name", "%Hibernate%")).
//		setProjection(Projections.min("price")).uniqueResult();
	}

}
