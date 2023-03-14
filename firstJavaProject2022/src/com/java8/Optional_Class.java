package com.java8;

import java.util.List;
import java.util.Optional;

public class Optional_Class {
	
	
	public static void main(String[] args) {
		
		List<String> strList = List.of("AB","CD");
		Optional<String> value = strList.stream().filter(e->e.equalsIgnoreCase("DE")).findAny();
		System.out.println(value); //Optional.empty
		
		
		Optional<String> value2 = strList.stream().filter(e->e.equalsIgnoreCase("CD")).findAny();
		System.out.println(value2); //Optional[CD]
		
		String value3 = strList.stream().filter(e->e.equalsIgnoreCase("CD")).findAny().get();
		System.out.println(value3); //CD
		
		//findAny() , findFirst() ei 2 to method e value aste o pare nao aste pare.
		//so java Optional<Obj> return kore. eta null o hote pare..jate exception na khay.
		//.get() korle value ta petye jbe.
		

	}

}
