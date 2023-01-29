package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Jdbc_create_a_table{

	public static void main(String args[]){


		try{	

			String driverName="oracle.jdbc.driver.OracleDriver";	
			Class.forName(driverName);

			String url= "jdbc:oracle:thin:@localhost:1521:orcl";
			String userName="sys as sysdba";
			String password="oracle";

			Connection con =  DriverManager.getConnection(url,userName,password);
			Statement st = con.createStatement();

			String query="create table t_project_v2 (at_project_id number(8), at_project_name varchar2(4000))";

			st.executeUpdate(query);

			System.out.println("Table Created successfully");

			con.close();


		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Table Not Created successfully");
		}

	}


}