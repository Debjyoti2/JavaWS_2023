package com.java8.optionalclass;

import java.util.Optional;

public class MianClass {
	
	public static void main(String[] args) {
		
		 String str="abc";
		 Optional<String> opstr = Optional.ofNullable(str);
		 System.out.println(opstr.orElse("No value present"));
		 
		 Optional<String> opstr2 = Optional.ofNullable(str);
		 if(opstr2.isPresent()) {
			 System.out.println("value present");
		 }
	     
		 opstr2.orElse("Default");
	
	}

}
