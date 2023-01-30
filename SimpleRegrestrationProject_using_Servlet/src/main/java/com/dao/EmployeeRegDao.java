package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeRegDao {
	
	
	public Integer registerEmployee(Integer employeeId,String employeeName,String employeeEmail,Integer employeeAge,Long employeeMobile,String employeeDept) {
		
		Integer responseCode=99;
		try {
		Connection con = ConnectionProvider.getConnection();
		
		String sql="insert into t_employee_master (employee_id,employee_name,employee_email,employee_age,employee_mobile,employee_dept)"
				+ "values(?,?,?,?,?,?)";
				
		PreparedStatement pst = con.prepareStatement(sql);
		
		pst.setInt(1,employeeId);
		pst.setString(2, employeeName);
		pst.setString(3,employeeEmail);
		pst.setInt(4,employeeAge);
		pst.setLong(5,employeeMobile);
		pst.setString(6, employeeDept);
		
		int rowUpdate = pst.executeUpdate();
		
		con.close();
		
		if(rowUpdate>0) {
		  responseCode=1000;
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return responseCode;
		
	}

}
