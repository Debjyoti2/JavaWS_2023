package com.store_images_in_db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	public static Connection con;

	public static Connection getConnection(){

		try{

			String driverName="oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);


			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String userName="sys as sysdba";
			String password="oracle";

			con = DriverManager.getConnection(url, userName, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return con;
	}

}
