package com.servlets;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import com.dao.EditProfileDao;
import com.helper.HelperUploadDownLoad;
import com.helper.Message;
import com.helper.ResponseObj;
import com.vo.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

@MultipartConfig
public class EditProfileServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		ResponseObj response = new ResponseObj();
		
		User user= new User();
		user.setUserId(Integer.valueOf(req.getParameter("userId")));
		user.setUserName(req.getParameter("userName"));
		user.setEmail(req.getParameter("email"));
		user.setPassword(req.getParameter("password"));
		
		
		Part part = req.getPart("profilePic");
		String extention=part.getContentType().substring(5, part.getContentType().length());
	    extention=extention.replace("/",".");
		String picName="PROFILE_PIC_"+user.getUserId()+extention;
		user.setProfilePhoto(picName);
		
		EditProfileDao dao = new EditProfileDao();
		Message msg=new Message();
		try {
			response= dao.editProfileDetails(user);
			if(response.getResponseCode()==1000) {
				 String path = req.getRealPath("/")+"images"+File.separator + picName;
				 
				 HelperUploadDownLoad.deleteFile(path);
				 
				 if(HelperUploadDownLoad.saveFile(part.getInputStream(), path)) {
					 msg = new Message(response.getResponseMessage(),"alert","alert-success");
				 }
				 
			}
			else {
				 msg = new Message(response.getResponseMessage(),"alert","alert-danger");
			}
			HttpSession session = req.getSession();
			session.setAttribute("MSG", msg);
			res.sendRedirect("login.jsp");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
