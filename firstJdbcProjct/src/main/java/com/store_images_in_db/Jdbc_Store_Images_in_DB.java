package com.store_images_in_db;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Jdbc_Store_Images_in_DB {

	public static void main(String[] args) {
		try {
			Connection con= ConnectionProvider.getConnection();

			String query="insert into t_pwb_images(at_image_id,at_images) values(?,?)";
			PreparedStatement pst = con.prepareStatement(query);

			//setting image to PreparedStatement
			File file= new File("F:\\Images\\raanjhanaa-1366x768.jpg");
			FileInputStream fis = new FileInputStream(file);
			pst.setInt(1,100);
			pst.setBinaryStream(2, fis,fis.available());

			pst.executeUpdate();

			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
