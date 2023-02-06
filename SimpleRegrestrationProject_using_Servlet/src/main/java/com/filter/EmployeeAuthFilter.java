package com.filter;

import java.io.IOException;
import java.lang.module.ModuleDescriptor.Requires;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeAuthFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

      String empId= req.getParameter("employee_id");
      if(empId.startsWith("2")) {
    	  System.out.println("Auth Validation Passed !!!!!!!!!!!");
    	  chain.doFilter(req, res);
      }
      else {
    	System.out.println("Auth Validation Error Emp ID should starts with 2 only!!!!!!!!!!!");
    	HttpServletResponse rs = (HttpServletResponse) res;
    	rs.sendRedirect("pages/validationError.html");
      }
		
	}

}
