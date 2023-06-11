package com.java8.optionalclass;

import java.util.Optional;

public class MianClass {
	
	public static void main(String[] args) {
		
		 String str="abc";
		 Optional<String> opstr = Optional.ofNullable(str);
		 System.out.println(opstr.orElse("No value present"));
	}

}
