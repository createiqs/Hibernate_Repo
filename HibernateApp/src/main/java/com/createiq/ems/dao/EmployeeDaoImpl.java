package com.createiq.ems.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

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
		session = HibernateUtil.getSession();
		Employee employee = (Employee) session.get(Employee.class, id);
		session.delete(employee);
		session.getTransaction().commit();
		HibernateUtil.closeSession(session);

	}

	public void findById(int id) {
		session = HibernateUtil.getSession();
//		Employee employee = (Employee) session.get(Employee.class, id);
//		System.out.println(employee);
		Query query = session.createQuery("select e.ename, e.esal, e.email from Employee e where e.eid=" + id);
		List<Object[]> employee = query.list();
		for (Object[] objects : employee) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);
		}
		HibernateUtil.closeSession(session);

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
