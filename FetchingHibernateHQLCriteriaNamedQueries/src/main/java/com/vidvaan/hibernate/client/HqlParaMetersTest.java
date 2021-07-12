package com.vidvaan.hibernate.client;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.vidvaan.hibernate.entity.Person;

public class HqlParaMetersTest {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		SessionFactory seFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = seFactory.openSession();
		System.out.println(seFactory.openSession());

//		String hql="Select p.id, p.firstName, p.gender, p.email from Person p where p.country=: c";
//		Query query = session.createQuery(hql);
//		query.setParameter("c", "Germany");
//		List<Object []> Uspersons= query.list();
//		for (Object [] person : Uspersons) {
//			System.out.println(person[0]);
//			System.out.println(person[1]);
//			System.out.println(person[2]);
//			System.out.println(person[3]);
//			System.out.println("\n");
//			
//		}

//		String hql = "select p.id, p.lastName, p.dob, p.country from Person p where p.gender=:f";
//		Query query = session.createQuery(hql);
//		query.setParameter("f", "Female");
//		query.setFirstResult(0);
//		query.setMaxResults(5);
//		List<Object[]> Females = query.list();
//		for (Object[] person : Females) {
////			System.out.println(person[0]);
////			System.out.println(person[1]);
////			System.out.println(person[2]);
////			System.out.println(person[3]);
////			System.out.println("\n");
//			System.out.println(Arrays.toString(person));
//		}

//		 Query query = session.createQuery("select e.name, sum(e.salary), count(e)"
//				+ " from Employee e where e.name like '%i%' group by e.name");
//		List<Object[]> groupList = query.list();
//		for(Object[] arr : groupList){
//			System.out.println(Arrays.toString(arr));
//		
//		"from Employee e order by e.id desc"
		// HQL order by example
//		Query query = session.createQuery("from Person p order by p.country desc");
//		List<Person> persons = query.list();
//		for (Person person : persons) {
//			System.out.println("ID Desc Order Persons::" + person.getPid()+ "," + person.getFirstName() + "," + person.getCountry());
//		}

		Query query=session.createQuery("from Person p order by p.country");
		query.setFirstResult(0);
		query.setMaxResults(10);
		List<Person> list = query.list();
	
		for (Person person : list) {
			System.out.println(person);
		}

		// group by

//		Query query = session.createQuery("select p.pid, p.country, p.dob from Person p group by p.gender=:m");
//		query.setParameter("m", "Male");
//		List<Object[]> list = query.list();
//		for (Object[] objects : list) {
//			System.out.println(Arrays.toString(objects));
//		}
	}

}
