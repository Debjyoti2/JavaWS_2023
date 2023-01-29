package com.java8.java8datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java8DateTime {

	public static void main(String[] args) {


		LocalDate ld = LocalDate.now();
		System.out.println("LocalDate is :: " + ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println("LocalTime is :: " + lt);
		
		LocalDateTime ldlt = LocalDateTime.now();
		System.out.println("LocalDateTime is :: " + ldlt);
		
		DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(ld.format(df));
		
		

	}

}
