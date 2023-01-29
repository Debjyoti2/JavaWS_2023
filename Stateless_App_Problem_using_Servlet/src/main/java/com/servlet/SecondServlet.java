package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("user_name");
		out.println("<h2> Name is in second servlet:: " + name + "</h2>" );
		
		//Notes
		
		//Servlet1 and Servlet2 has HttpServletRequest req. but both are completely differrent.
		// So  req.getParameter("user_name") is null here.
		
		//if we forward the req from Servlet1 to Servlet2 that is a different scenerio. then we are forwarding same req only.
		
		
	}
	
}
