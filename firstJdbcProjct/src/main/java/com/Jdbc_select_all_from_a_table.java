package com;

//first programme for jdbc
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Jdbc_select_all_from_a_table
class Jdbc_select_all_from_a_table{


	public static void main(String args[])
	{
		try{
			//load the driver
			String driverName="oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);

			//create connection object
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String userName="sys as sysdba";
			String password="oracle";

			Connection con= DriverManager.getConnection(url,userName,password);

			//if(con.isClosed()){
			//	System.out.println("Connection is closed");
			//}
			//else{
			//	System.out.println("Connection is created");
			//}

			//create statement
			Statement st = con.createStatement();

			//execute query
			String query="Select * from t_employee_mst";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()){
				System.out.println("Employye is :: " + rs.getInt("at_emp_id") + " " + rs.getString("at_emp_name"));
			}
			con.close();



		}
		catch(Exception e){
			e.printStackTrace();
		}




	}





}