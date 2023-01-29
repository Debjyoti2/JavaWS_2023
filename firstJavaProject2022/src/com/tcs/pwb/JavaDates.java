package com.tcs.pwb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class JavaDates {
	public static void main(String[] args) {
		
		
		DateTimeFormatter f;
		LocalTime i;
		
		
		LocalDate l = LocalDate.now();
		String  j =l.minusYears(100).toString();
		System.out.println(j);
		
		
		LocalDateTime p= LocalDateTime.now();
		System.out.println(p);
		LocalDateTime s1= p.minusDays(1);
		System.out.println(s1.toString());
		System.out.println(s1.isAfter(p));
		
		List<Integer> _list = new ArrayList<Integer>();
		_list.size();
		
		
	}

}
