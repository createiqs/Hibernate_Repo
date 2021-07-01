package com.createiq.ems.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.ems.dao.EmployeeDAO;
import com.createiq.ems.dao.EmployeeDaoImpl;
import com.createiq.ems.entity.Employee;

public class EmployeeFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeDAO dao = new EmployeeDaoImpl();
		List<Employee> employees = dao.getAllEmps();
		request.setAttribute("emps", employees);
		request.getRequestDispatcher("emp.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
