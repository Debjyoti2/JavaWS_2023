package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import com.dao.RegisterUserDao;
import com.helper.ResponseObj;
import com.vo.User;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@MultipartConfig
public class RegisterUser extends HttpServlet{ 
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ResponseObj obj = new ResponseObj();
		
		User user = new User();
		user.setUserName(req.getParameter("userName"));
		user.setEmail(req.getParameter("email"));
		user.setPassword(req.getParameter("password"));
		user.setGender(req.getParameter("gender"));
		user.setRegDate(LocalDateTime.now().toString());
		
		if(req.getParameter("remember") == null || !"rememberChecked".equalsIgnoreCase(req.getParameter("remember"))) {
			PrintWriter out = res.getWriter();
			out.println("Please accepts terms and conditions !!!");
		}
		else {
			RegisterUserDao dao = new RegisterUserDao();
			obj = dao.registerNewUser(user);
			
			PrintWriter out = res.getWriter();
			out.println(obj.getResponseMessage());
		}
		
		
		
	}

}
