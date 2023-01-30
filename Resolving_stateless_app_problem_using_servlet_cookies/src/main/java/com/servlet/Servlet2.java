package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String userName="";
		Integer userId=0;
		
			Cookie[] ckArray = req.getCookies();
			for(Cookie ck : ckArray) {
				if("USER_NAME".equalsIgnoreCase(ck.getName())) {
					 userName=ck.getValue();
				}
				if("USER_ID".equalsIgnoreCase(ck.getName())) {
					 userId = Integer.valueOf(ck.getValue());
				}
			}
			
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			
			out.println("Servlet 2 - User Name is :: " + userName);
			out.println("Servlet 2 - userId is :: " + userId);
		
	}

}
