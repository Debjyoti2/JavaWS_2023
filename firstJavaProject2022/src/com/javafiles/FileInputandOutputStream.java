package com.javafiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputandOutputStream {

	public static void main(String[] args) throws IOException {


		//FileInputStream is for file reading 
		
		//FileOutputStream is for file writing
		
		
		File f = new File("E:\\FileOutPut\\FileInputandOutputStream.txt");
		f.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(f);
		fos.write("Hi I am  a good boy".getBytes());
		fos.flush();
		fos.close();
		
		FileInputStream fis = new FileInputStream(f);
		int i=fis.read();
		while(i!=-1) {
			char eachchar =(char) i;
			System.out.print(eachchar);
			i=fis.read();
		}
		fis.close();
		
		
		//now big qstn ???
		
		//FileReader , FileWriter we will use when we will read any prop file, or any files  having only char.
		
		
		//But FileInputStream,FileOutputStream can read any byte data such as images
		//so when to download the images from server and fetch in frontend then we need to use FileInputStream, FileOutputStream
		//FileInputStream,FileOutputStream can also process char and text.
		
	}

}
