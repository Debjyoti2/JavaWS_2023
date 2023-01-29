package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String userName=(String) req.getAttribute("USER_NAME");
		String password =(String) req.getAttribute("PASSWORD");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("USername given  ::: " + userName);
		out.println("password given  ::: " + password);
		
		
		
	}

}
