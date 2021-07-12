package com.vidvaan.hibernate.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vidvaan.hibernate.entity.Person;

public class HQLTest {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		SessionFactory seFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = seFactory.openSession();
		System.out.println(seFactory.openSession());

		// find all persons
//		List<Person> persons = session.createQuery("from Person").list();
//		for (Person person : persons) {
//			System.out.println(person);
//		}
//			
		// select queries
//			List<Object[]> persons = session.createQuery("select p.id, p.firstName, p.gender from Person p").list();
//			for (Object [] person : persons) {
//				System.out.println(person [0]);
//				System.out.println(person [1]);
//				System.out.println(person [2]);
//		}

//select with where  clause
//		List<Object[]> persons = session.createQuery("select  p.firstName, p.gender from Person p where p.id=1").list();
//		for (Object[] person : persons) {
//			System.out.println(person[0]);
//			System.out.println(person[1]);
//			

		// select with order by clause
//		List<Object[]> persons = session
//				.createQuery("select distinct  p.id, p.firstName, p.gender, p.country from Person p order by p.country")
//				.setMaxResults(10).list();
//		for (Object[] person : persons) {
//			System.out.println(person[0]);
//			System.out.println(person[1]);
//			System.out.println(person[2]);
//			System.out.println(person[3]);
//
//		}

	}

}
