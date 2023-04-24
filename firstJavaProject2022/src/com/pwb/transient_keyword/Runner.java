package com.pwb.transient_keyword;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner {
	
	public static void main(String[] args) {
		
		String fileName = "employee.ser";
		serializeObject(fileName);
		deserializeObject(fileName);
		
	}
	
	
	public static void serializeObject(String fileName) {
		
		Employee e1 = new Employee(1, "Kunal", "Kolkata", "12345");
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
			oos.writeObject(e1);
			System.out.println("Serialization done ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void deserializeObject(String fileName) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)))) {
			Object object = ois.readObject();
			Employee employee=(Employee)object;
			System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
