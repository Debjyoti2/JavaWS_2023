package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.servlet.EmployeeVo;

public class FetchEmpDetailsDao {
	
	
	public EmployeeVo fetchEmpDetails(Integer empId) {
		
		EmployeeVo emp = new EmployeeVo();
		
		try {
			
			Connection con = ConnectionProvider.getConnection();
			String query ="select * from t_employee_master s where s.employee_id=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1,empId);
			ResultSet rs =  pst.executeQuery();
			
			while (rs.next()) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setEmployeeName(rs.getString("employee_name"));
				emp.setEmployeeEmail(rs.getString("employee_email"));
				emp.setEmployeeAge(rs.getInt("employee_age"));
				emp.setEmployeeMobile(rs.getLong("employee_mobile"));
				emp.setEmployeeDept(rs.getString("employee_dept"));
			}
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return emp;
		
	}
	

}
