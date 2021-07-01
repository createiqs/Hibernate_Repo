package com.createiq.ems.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.ems.dao.EmployeeDAO;
import com.createiq.ems.dao.EmployeeDaoImpl;
import com.createiq.ems.entity.Employee;

public class EmployeeSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeDAO dao = new EmployeeDaoImpl();
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double esal = Double.parseDouble(request.getParameter("esal"));
		String email = request.getParameter("email");
		Employee employee = new Employee(ename, esal, email);
		dao.save(employee);
		request.setAttribute("msg", "Inserted Record Successfully!!");
		request.getRequestDispatcher("findAll").forward(request, response);

	}

}
