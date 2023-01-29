package com.formsubmit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormSubmit extends HttpServlet{

	
	//Notes
	//RequestDispatcher has 2 main method
	//1. rd.include("abc.html") --it includes a whole page inside
	
	//2.  rd.forward(abcservlet.java)--it will forwarded to a new servlet
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out  = res.getWriter();
       
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("gender");
		String course =req.getParameter("user_course");
		String condition=req.getParameter("condition");
		
		if(condition!=null && condition.equalsIgnoreCase("agreed")) {
			out.println("<h2> Name : " + name + "</h2>");
			out.println("<h2> password : " + password + "</h2>");
			out.println("<h2> email : " + email+ "</h2>");
			out.println("<h2> gender : " + gender+ "</h2>");
			out.println("<h2> course : " + course+ "</h2>");
			
			RequestDispatcher rd1 = req.getRequestDispatcher("successMsgServlet");
			rd1.forward(req, res);
			
		}
		
		else {
		 out.println("Pls click on agree first.. again chk and  fill details...........");	
		 RequestDispatcher rd = req.getRequestDispatcher("pages/index.html");
		 rd.include(req, res);
		}

		
		
		
		
		
	}
	
	
}
