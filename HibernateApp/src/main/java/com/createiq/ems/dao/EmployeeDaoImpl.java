package com.createiq.ems.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.createiq.ems.entity.Employee;
import com.createiq.ems.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDAO {

	private static Session session = null;

	public void save(Employee employee) {
		session = HibernateUtil.getSession();
		session.save(employee);
		session.getTransaction().commit();
		HibernateUtil.closeSession(session);

	}

	public void update(Employee employee) {
		session = HibernateUtil.getSession();
		session.saveOrUpdate(employee);
		session.getTransaction().commit();
		HibernateUtil.closeSession(session);

	}

	public void delete(int id) {

	}

	public void findById(int id) {
		// TODO Auto-generated method stub

	}

	public List<Employee> getAllEmps() {
		session = HibernateUtil.getSession();
		Query query = session.createQuery("from Employee");
		List<Employee> listOfEmps = query.list();
		HibernateUtil.closeSession(session);
//		for (Employee employee : listOfEmps) {
//			System.out.println(employee);
//		}
		return listOfEmps;
	}

}
