package com.properties.fileload;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class Notes {
	public static void main(String[] args) {


		//if we store any prop file in jobss server > module>env>main
		//then we can pick it up:
		ResourceBundle rb = ResourceBundle.getBundle("Prop_file_name_without_extension");
		String Id = rb.getString("KEY_NAME");



		//if we store any file in jboss>domain>configuration folder then get it by below
		File f2 = new File(System.getProperty("jboss.domain.config.dir"), "filename.properties");
		try {
			FileInputStream fis = new FileInputStream(f2);
			Properties p2 = new Properties();
			p2.load(fis); 
		}
		catch(Exception e) {   
			e.printStackTrace();
		}


		//normally prop file loading in java
		File file = new File("F:\\credential.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			System.out.println("ID is ::" + prop.getProperty("ID"));
			System.out.println("ID is ::" + prop.getProperty("PASSWORD"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}






	}



}
