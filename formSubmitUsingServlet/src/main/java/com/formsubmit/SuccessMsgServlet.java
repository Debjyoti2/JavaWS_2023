package com.formsubmit;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SuccessMsgServlet extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		RequestDispatcher rd  =  req.getRequestDispatcher("pages/successPage.html");
		rd.include(req, res);
		
		
	}

}
