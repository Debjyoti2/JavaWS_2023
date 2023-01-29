package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc_PreparedStatement_Types {

	public static void main(String[] args) {

		try {
			String driverName="oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);
			//create connection object
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String userName="sys as sysdba";
			String password="oracle";
			Connection con= DriverManager.getConnection(url,userName,password);



			//1. creating a table
			String query1="create table test_1(at_number number(10))";
			PreparedStatement pst= con.prepareStatement(query1);
			pst.executeUpdate();
			
			
			//2.inserting data in table
			String query2="insert into test_1(at_number) values(?)";
			PreparedStatement pst2=con.prepareStatement(query2);
			pst2.setInt(1,120);
			int rowcount=pst2.executeUpdate();
			
			//2.updating data in table
			String query3="update test_1 set at_number=? where at_number=?";
			PreparedStatement pst3=con.prepareStatement(query3);
			pst3.setInt(1,125);
			pst3.setInt(2,120);
			rowcount=pst3.executeUpdate();
			
			
			//3.sececting a data from a table
			String query4="select * from test_1";
			PreparedStatement pst4=con.prepareStatement(query4);
			ResultSet rs=pst4.executeQuery();
			while(rs.next()) {
				System.out.println("test1 is ::: " + rs.getInt("at_number"));
			}
					

			//deleting a table
			String query5="delete from test1";
			PreparedStatement pst5 =con.prepareStatement(query5);
			rowcount=pst5.executeUpdate();
			
			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}



	}

}
