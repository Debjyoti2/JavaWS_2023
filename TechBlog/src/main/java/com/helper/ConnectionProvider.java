package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static Connection con;

	public static Connection getConnection(){ 


		try {

			if(con==null) {
				String driverName="oracle.jdbc.driver.OracleDriver";
				Class.forName(driverName);

				String url="jdbc:oracle:thin:@localhost:1521:orcl";
				String userName="sys as sysdba";
				String password="oracle";

				con= DriverManager.getConnection(url, userName, password);
			}
			return con;

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;

	}


}
