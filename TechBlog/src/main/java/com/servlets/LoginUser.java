package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.dao.LoginUserDao;
import com.dao.UserProfileDao;
import com.helper.HMACUtils;
import com.helper.Message;
import com.helper.ResponseObj;
import com.utility.ValidationUtility;
import com.vo.User;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@MultipartConfig
public class LoginUser extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		try {

			if(!ValidationUtility.isNotNull(req.getParameter("email"))) {
				Message msg = new Message("Please provide email.", "error","alert-danger");
				HttpSession session = req.getSession();
				session.setAttribute("MSG", msg);
				res.sendRedirect("login.jsp");
			}
			else if(!ValidationUtility.isNotNull(req.getParameter("password"))) {
				Message msg = new Message("Please provide password.", "error","alert-danger");
				HttpSession session = req.getSession();
				session.setAttribute("MSG", msg);
				res.sendRedirect("login.jsp");
			}
			else {
				User user = new User();
				user.setEmail(req.getParameter("email"));
				user.setPassword(req.getParameter("password"));

				ResponseObj response = new ResponseObj();

				LoginUserDao dao = new LoginUserDao();
				response = dao.userLogin(user);
				
				if(response.getResponseCode()==1000) {
					String secretLoginKey = HMACUtils.hmacWithJava(user.getEmail(),user.getPassword());
					dao.storeSecretKey((Integer) response.getOutputResponse1(), secretLoginKey );
					Cookie cookie = new Cookie("secretLoginKey", secretLoginKey);
					res.addCookie(cookie);
					
					User newuser =new User();
					UserProfileDao daoProfile = new UserProfileDao();
					newuser =daoProfile.getLoggedUserDetails(secretLoginKey);
					HttpSession session = req.getSession();
					session.setAttribute("USER", newuser);
					res.sendRedirect("profile.jsp");
					
				}
				else {
					Message msg = new Message(response.getResponseMessage(), "error","alert-danger");
					HttpSession session = req.getSession();
					session.setAttribute("MSG", msg);
					res.sendRedirect("login.jsp");
					
				}
				

			}

		}
		catch(Exception e ) {
			e.printStackTrace();
		}


	}


}
