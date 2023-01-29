package com.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	
	// <?> --unbound wildcard
	// <? extends ParentClass> obj   --upper bound wildcard .(upor ta bound ache..upore jete prbe na , niche jbe..tai UPPER bound)  
	  //means obj can be ParentClass itself or any childclass of  ParentClass
	
	
	// <? super ChildClass> obj --lower bound wildcard . (niche ta bound ache..niche jete prbe na , upore jbe..tai LOWER bound)
	  //means obj can be childclass itself or any parentclass of  childclass
	
	//lower bound wildcards
	public static void printShape(List<? extends Shape> list){
		for(Shape s : list) {
			s.draw(); 
		}
	}
	
	public static void printShape2(List<? super Reactangle> list2){
//		for(Reactangle s : list2) {
//			s.draw();
//		}
	}
	
	public static void main(String[] args) {
		
		List<Reactangle> list1 = new ArrayList<>();
		list1.add(new Reactangle());
		printShape(list1);
		
		List<Square> list2 = new ArrayList<>();
		list2.add(new Square());
		printShape(list2);
		
	}
	
}

//lower bound wildcards ::    List<? extends ParentClass>
//means List of any class which is extending ParentClass , i.e List of any class which is Child of the ParentClass

//upper bound wildcards :: List<? super ChildClass>
//means List of any class which is Parent  of the ChildClass




