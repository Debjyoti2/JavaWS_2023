package com.dao;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;

import com.helper.ConnectionProvider;
import com.helper.ResponseObj;
import com.vo.User;

public class LoginUserDao {
	
	private Connection con;
	
	public LoginUserDao() {
		this.con=ConnectionProvider.getConnection();
	}
	
	public ResponseObj userLogin(User user) throws SQLException, InvalidKeyException, NoSuchAlgorithmException {
		ResponseObj response = new ResponseObj();
		int userId=0;
		
		String query="select nvl(m.at_userid,0) v_count from t_usermst m where m.at_email=? and m.at_password=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1,user.getEmail());
		pst.setString(2,user.getPassword());
		
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
		  userId = rs.getInt("v_count");
		}
		
		if(userId>0) {
			response.setOutputResponse1(userId);
			response.setResponseCode(1000);
			response.setResponseMessage("User Validated");
		}else {
			response.setResponseCode(9999);
			response.setResponseMessage("either email or password or both not matching !!!! ");
		}
		return response;
		
	}
	
	public void storeSecretKey(Integer userId, String secretLoginKey) throws SQLException {
		
		String query1="select count(1) v_count from t_user_login_details s where s.at_userid=?";
		PreparedStatement pst1 =  con.prepareStatement(query1);
		pst1.setInt(1,userId);
		ResultSet rs = pst1.executeQuery();
		rs.next();
		int presentCount =rs.getInt("v_count");
		
		Date currentDateTime = localTimeToDate(LocalDateTime.now());
		
		if(presentCount>0) {
			
			String updateQuery = "update t_user_login_details s set s.at_secret_login_key=?, s.at_logged_in=? where s.at_userid=?";
			PreparedStatement pst2 = con.prepareStatement(updateQuery);
			pst2.setString(1, secretLoginKey);
			pst2.setDate(2, currentDateTime);
			pst2.setInt(3, userId);
			pst2.executeUpdate();
		}
		
		else {
			String query ="insert into t_user_login_details(at_userid,at_secret_login_key,at_logged_in) values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, userId);
			pst.setString(2, secretLoginKey);
			pst.setDate(3,currentDateTime);
			
			pst.executeUpdate();
		}
		
		
	}
	
	public static java.sql.Date localTimeToDate(LocalDateTime lt) {
	    return new java.sql.Date(lt.atZone(ZoneId.systemDefault()).toInstant()
	        .toEpochMilli());
	  }

}
