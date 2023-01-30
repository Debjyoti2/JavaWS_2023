package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.dao.FetchEmpDetailsDao;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewDetailsServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		Cookie[] cookies =  req.getCookies();
		Integer empId=null;
		
		if(cookies!=null) {
			for(Cookie c :cookies) {
				if("EMP_ID".equalsIgnoreCase(c.getName())) {
					 empId = Integer.valueOf(c.getValue());
				}
			}
			
			FetchEmpDetailsDao dao = new FetchEmpDetailsDao();
			EmployeeVo emp  = dao.fetchEmpDetails(empId);
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<h2>" + emp.toString() + "</h2>");
			
		}
		else {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<h1>Please do the regrestration first.........</h1>");
		}
		
		
		
	}

}
