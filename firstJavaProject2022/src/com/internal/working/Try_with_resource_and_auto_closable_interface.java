package com.internal.working;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_with_resource_and_auto_closable_interface {

	
	public static void main(String[] args) {
		
		try(FileReader r = new FileReader(new File("abc.txt"));){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		try{
			
		}
		catch(Exception e) {
			
		}
		finally {
			
		}
		
		
		
	}
	
	
}




/*
writing filereader inside 1st bracket of try block .. its called try with resources.. this resources does
not need any finally block to close this resources.. <try with resources> implements autoclosabel interface since java 1.7
so resources autoclosed when work done.. no need to finally block.

*/