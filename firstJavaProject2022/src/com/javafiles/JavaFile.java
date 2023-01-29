package com.javafiles;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFile {

	public static void main(String[] args) {

		try {	

			//Creating a text file
			File file = new File("E:\\FileOutPut\\webserviceIdPasswordDetails.txt");
			file.createNewFile();
			

	//writing on a text file 
			
			//process 1
			FileWriter filewriter = new FileWriter(file);
			filewriter.write("Id : ABCDE \nPASSWORD: 12345");
			filewriter.close();

			//process 2
			//FileOutputStream fos = new FileOutputStream(file);
			//fos.write("Id : ABCDE \\nPASSWORD: 12345".getBytes());
			//fos.flush();
			//fos.close();


    //reading from a file
			
			
			//process 1
//			Scanner sc = new Scanner(file);
//			while(sc.hasNextLine()) {
//				String line  = sc.nextLine();
//				System.out.println(line);
//			}
//			sc.close();
			
			
			
			//process 2
//			FileInputStream fis = new FileInputStream(file);
//			int i=fis.read();
//			while(i!=-1) {
//				char eachChar = (char) i;
//				System.out.print(eachChar);
//				i=fis.read();
//			}
			
			
			
			
			//process 3
			FileReader filereader = new FileReader(file);
			int j=filereader.read();
			while(j!=-1) {
				char eachchar = (char) j;
				System.out.print(eachchar);
				j=filereader.read();
			}
			filereader.close();
			


	//delete a file
			file.delete();

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
