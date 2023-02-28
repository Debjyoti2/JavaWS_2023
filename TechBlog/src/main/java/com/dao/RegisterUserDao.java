package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.helper.ConnectionProvider;
import com.helper.ResponseObj;
import com.vo.User;

public class RegisterUserDao {

	private Connection con;

	public RegisterUserDao() {
		this.con =  ConnectionProvider.getConnection();     
	}

	public int generateUserId() {
		
		int userId=0;
		try {
		String query = "select nvl(max(at_userid),0) at_userId from t_usermst";
		PreparedStatement pst = con.prepareStatement(query);
		
		ResultSet rs =  pst.executeQuery();
		rs.next();
		userId =  rs.getInt("at_userId");
		userId++;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return userId;
		
	}
	
	public ResponseObj registerNewUser(User user) {
		int rowcreated=0;
		ResponseObj response =  new ResponseObj();


		try {
			String query = "insert into t_usermst (at_userid,at_username,at_email,at_password,at_gender) values(?,?,?,?,?)";
			PreparedStatement pst;
			pst = con.prepareStatement(query);
			pst.setInt(1,generateUserId());
			pst.setString(2,user.getUserName());
			pst.setString(3,user.getEmail());
			pst.setString(4,user.getPassword());
			pst.setString(5, user.getGender());

			rowcreated = pst.executeUpdate();
			if(rowcreated>0) {
				response.setResponseCode(1000);
				response.setResponseMessage("Regrestration Done Successfully");
			}
			else {
				response.setResponseCode(9999);
				response.setResponseMessage("Some Error Occurred");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return response;

	}

}
