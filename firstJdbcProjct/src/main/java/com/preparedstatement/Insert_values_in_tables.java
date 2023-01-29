package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Insert_values_in_tables {
	
	public static void main(String[] args) {
		
		try {
			
			List<ProjectVO> projectList = new ArrayList<>();
			projectList.add(new ProjectVO(12,"Project-1"));
			projectList.add(new ProjectVO(23,"Project-121"));
			projectList.add(new ProjectVO(234,"Project-124"));
			projectList.add(new ProjectVO(45,"Project-1456"));
			
			
			
			String driverName="oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);
			
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String userName="sys as sysdba";
			String password="oracle";
			Connection con =  DriverManager.getConnection(url, userName, password);
			
			String query="insert into t_project_v2 (at_project_id,at_project_name) values(?,?)";
			PreparedStatement pst= con.prepareStatement(query);
			
			for(ProjectVO obj:projectList) {
				pst.setInt(1,obj.getProjectid());
				pst.setString(2,obj.getProjectName());
				
				int rowCount= pst.executeUpdate();
				if(rowCount>0) {
					System.out.println("Data inserted successfully");
				}
			}
			con.close();
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
