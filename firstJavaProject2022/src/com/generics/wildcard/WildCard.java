package com.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	
	//Integer , Double   is the child class of Number
	
	   //Number
	
//Integer        //Double
	
	
//let say emon ekta method create korbo jeta Integer eo inout nbe and Double o input nebe
//then Number ke upperbound wildcard hisabe use korbo.

public static void printListUpperbound(List<? extends Number> list) {
	for(Number n : list) {
		System.out.println(n);
	}
}
	

public static void printListLowerbound(List<? super Integer> list) {
	for(Object n : list) {
		System.out.println(n);
	}
}
	
	
	
public static void main(String[] args) {
	
	List<Integer> nList = new ArrayList<>();
	nList.add(1);
	nList.add(2);
	nList.add(3);
	WildCard.printListUpperbound(nList);
	
	List<Double> dList = new ArrayList<>();
	dList.add(1.0);
	dList.add(2.0);
	dList.add(3.0);
	WildCard.printListUpperbound(dList);
	
	
}	
	
	
	
}
