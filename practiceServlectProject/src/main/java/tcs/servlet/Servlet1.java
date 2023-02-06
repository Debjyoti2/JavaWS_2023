package tcs.servlet;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		String empId = "252780";
		Cookie cookie= new Cookie("EMPID", empId);
		
		res.addCookie(cookie);
		
		
		
		Cookie[] cookieArray = req.getCookies();
		if(cookieArray!=null) {
			for(Cookie ck : cookieArray) {
				if(ck.getName().equals("EMP_ID")) {
					String empIdget = ck.getValue();
					break;
				}
			}
		}
		
	}

}
