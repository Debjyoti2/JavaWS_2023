package com.java8.coding_problems;

import java.util.List;

public class Chk_if_all_element_divide_by_2_count {
	public static void main(String[] args) {

		List<Integer> intList =  List.of(2,4,6,8,12,13);
		Long evencount = intList.stream().filter(e->e%2==0).count();
		if(evencount==intList.size()) {
			System.out.println("All the numbers divisible by 2");
		}
		else {
			System.out.println("All the numbers are not divisible by 2");
		}

		//pattren2
		boolean ifAllMatch = intList.stream().allMatch(e->e%2==0);
		if(ifAllMatch){
			System.out.println("All the numbers divisible by 2");
		}
		else{System.out.println("All the numbers are not divisible by 2");
		}
		
		//intList.stream().anyMatch(null)

	}

}
