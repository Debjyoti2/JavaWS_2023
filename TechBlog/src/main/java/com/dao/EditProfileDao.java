package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.helper.ConnectionProvider;
import com.helper.ResponseObj;
import com.vo.User;

public class EditProfileDao {

	private static Connection con;
	
	public EditProfileDao() {
		this.con=ConnectionProvider.getConnection();
	}
	
	public ResponseObj editProfileDetails(User user) throws SQLException {
		
		ResponseObj response = new ResponseObj();
		
		String query="update t_usermst m set m.at_username=?,m.at_email=?,m.at_password=?,m.at_profile_photo=? where m.at_userid=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, user.getUserName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());
		pst.setString(4, user.getProfilePhoto());
		pst.setInt(5, user.getUserId());
		
		int rowUpdated= pst.executeUpdate();
		
		if(rowUpdated>0) {
			response.setResponseCode(1000);
			response.setResponseMessage("Successfully Updated !!");
		}
		else {
			response.setResponseCode(999);
			response.setResponseMessage("Some Error Occurred !!");
		}
		
		return response;
		
	}
	
	
}
