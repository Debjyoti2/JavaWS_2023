package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_dynamic_values_in_a_table {

	public static void main(String[] args) {

		try {

			String driverName="oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);


			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String userName="sys as sysdba";
			String password="oracle";

			Connection con = DriverManager.getConnection(url,userName,password);

			String sql="insert into t_employee_mst(at_emp_id,at_emp_name,at_phone_no,at_age) values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);

			Scanner sc = new Scanner(System.in);
			System.out.println("Hi !! Enter the Employee Details");

			System.out.println("Please enter Employee Id");
			Integer empId = sc.nextInt();

			System.out.println("Please enter Employee Name");
			String empName = sc.next();

			System.out.println("Please enter Employee Phone Number");
			Integer empPhoneNo = sc.nextInt();

			System.out.println("Please enter Employee Age");
			Integer empAge = sc.nextInt();
			
			pst.setInt(1,empId);
			pst.setString(2, empName);
			pst.setInt(3,empPhoneNo);
			pst.setInt(4,empAge);
			
			Integer rowCount= pst.executeUpdate();
			if(rowCount>0) {
				System.out.println("Data inserted successfully");
			}
			
			con.close();
			

		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
