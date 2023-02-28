package com.servlets;

import java.io.IOException;

import com.helper.Message;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		session.removeAttribute("USER");
		session.removeAttribute("MSG");
		
		Message m= new Message("Logged out successfully","success","alert-success");
		session.setAttribute("MSG", m);
		res.sendRedirect("login.jsp");
		
	}

}
