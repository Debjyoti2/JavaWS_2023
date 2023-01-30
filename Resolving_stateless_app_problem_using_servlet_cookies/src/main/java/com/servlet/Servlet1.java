package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String userName=req.getParameter("user_name");
		Integer userId=Integer.valueOf(req.getParameter("user_id"));
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("User Name is :: " + userName);
		out.println("userId is :: " + userId);
		out.println("<a href='servlet2'> Click here to go to servlet2 </a>");
		
		//adding user_id and user_name in cookies
		Cookie ck_userName = new Cookie("USER_NAME",userName);
		Cookie ck_userId = new Cookie("USER_ID", String.valueOf(userId));
		
	   //Note :  can't set any space in  cookie value 
		res.addCookie(ck_userName);
		res.addCookie(ck_userId);
		
		
	}
	

}
