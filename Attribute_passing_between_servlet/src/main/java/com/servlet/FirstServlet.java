package com.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String userName=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		
		req.setAttribute("USER_NAME", userName);
		req.setAttribute("PASSWORD", password);
		
		RequestDispatcher rd = req.getRequestDispatcher("secondServlet");
		rd.forward(req, res);
	}

}
