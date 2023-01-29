package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


class Jdbc_insert_into_a_table{


	public static void main (String args[]){

		try{	

			String driverName="oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);

			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String userName="sys as sysdba";
			String password="oracle";
			Connection con = DriverManager.getConnection(url,userName,password);

			Statement st  = con.createStatement();

			String query="insert into t_project_v2 (at_project_id, at_project_name) values(825458,'Ultx-Project1')";
			st.executeUpdate(query);

			System.out.println("Data inserted successfully");
			con.close();



		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}