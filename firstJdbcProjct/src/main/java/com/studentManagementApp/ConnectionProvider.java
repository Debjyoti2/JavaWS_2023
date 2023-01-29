package com.studentManagementApp;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static Connection con;

	private ConnectionProvider() {
		//so its basically a singleton class
	}


	public static Connection getConnection() {
		try {

			String driverName="oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);

			String url= "jdbc:oracle:thin:@localhost:1521:orcl";
			String userName="sys as sysdba";
			String password="oracle";

			con=DriverManager.getConnection(url,userName,password);

		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return con;

	}

}
