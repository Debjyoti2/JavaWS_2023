package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.helper.ConnectionProvider;
import com.vo.User;

public class UserProfileDao {
	
	private static Connection con;
	
	public UserProfileDao() {
		this.con=ConnectionProvider.getConnection();
	}
	
	public User getLoggedUserDetails(String  secretLoginKey) throws SQLException {
		
		User user = new User();
		
		String query="select m.at_userid,m.at_username,at_email,at_gender,reg_date,at_profile_photo from t_usermst m,t_user_login_details l where m.at_userid = l.at_userid and l.at_secret_login_key=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1,secretLoginKey);
		
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			user.setUserId(rs.getInt("at_userid"));
			user.setUserName(rs.getString("at_username"));
			user.setEmail(rs.getString("at_email"));
			user.setGender(rs.getString("at_gender"));
			user.setRegDate(rs.getString("reg_date"));
			user.setProfilePhoto(rs.getString("at_profile_photo")==null?"default.png":rs.getString("at_profile_photo"));
		}
		
		return user;
		
		
	}
	

}
