package com.createiq.ems.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.createiq.ems.entity.Employee;
import com.createiq.ems.util.ConnectionUtil;
import com.createiq.ems.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDAO {

	private static Session session = null;

	public void save(Employee employee) {
//		session = HibernateUtil.getSession();
		session = ConnectionUtil.getSessionFactory().openSession();
		session.save(employee);
		session.beginTransaction().commit();
//		HibernateUtil.closeSession(session);
		session.close();
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
//		session = ConnectionUtil.getSessionFactory().openSession();
		List<Employee> listOfEmps = session.createQuery("from Employee").list();
		HibernateUtil.closeSession(session);
		return listOfEmps;
	}

//	public static void main(String[] args) {
//		EmployeeDAO dao=new EmployeeDaoImpl();
//		List<Employee> allEmps = dao.getAllEmps();
//		for (Employee employee : allEmps) {
//			System.out.println(employee);
//		}
//	}

}
