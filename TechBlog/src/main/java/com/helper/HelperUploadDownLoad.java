package com.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class HelperUploadDownLoad {
	
	public static boolean deleteFile(String path) {
		
		boolean isDeleted=false;
		
		try {
			File file = new File(path);
			isDeleted= file.delete();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isDeleted;
		
	}
	
	
	public static boolean saveFile(InputStream fis ,  String path) {
		boolean isSaved = false;
		
		try {
			
			byte b[] = new byte[fis.available()];
			fis.read(b);
			
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(b);
			fos.flush();
			fos.close();
			
			isSaved=true;
			
			
		}catch(Exception  e) {
			e.printStackTrace();
			
		}
		
		return isSaved;
		
	}

}
