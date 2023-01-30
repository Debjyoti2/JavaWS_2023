package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.dao.EmployeeRegDao;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegrestrationServlet extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		Integer employeeId=Integer.valueOf(req.getParameter("employee_id")); 
		String employeeName=req.getParameter("employee_name");
		String employeeEmail=req.getParameter("employee_email");
		Integer employeeAge =Integer.valueOf(req.getParameter("employee_age"));
		Long employeeMobile =Long.valueOf(req.getParameter("employee_mobile"));
		String employeeDept=req.getParameter("employee_dept");
		
		EmployeeRegDao dao = new EmployeeRegDao();
		Integer errorCode = dao.registerEmployee(employeeId,employeeName,employeeEmail,employeeAge,employeeMobile,employeeDept);
		
		if(errorCode==1000) {
			Cookie empIdCookie = new Cookie("EMP_ID",String.valueOf(employeeId));
			res.addCookie(empIdCookie);
		}
		
		
	}

}
