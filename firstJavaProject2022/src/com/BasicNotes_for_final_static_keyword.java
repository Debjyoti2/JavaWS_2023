package com;

public class BasicNotes_for_final_static_keyword {
	
	//final class cant be extended by subclasses --chk java String class
	//final method cant be override in subclasses --chk methods java String class
	//in final variables once value assigned , cant be modified.
	
	
	
	
	//static variable
	
	//static variable object r sathe bind thake na.. direct class r sathe thake..
	
	public static void main(String[] args) {
		
		FootBallClub e1 = new FootBallClub("A",20);
		FootBallClub e2 = new FootBallClub("B",30);
		FootBallClub e3 = new FootBallClub("C",40);
		
//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e3);
		
		//if field : numberOfPlayerinClub is not static  then result is below: 
		
//		FootBallClub [playerName=A, playerJersyNumber=20, numberOfPlayerinClub=1]
//		FootBallClub [playerName=B, playerJersyNumber=30, numberOfPlayerinClub=1]
//		FootBallClub [playerName=C, playerJersyNumber=40, numberOfPlayerinClub=1]
		
		//means numberOfPlayerinClub is binded with object and each time new object created its new instantiated.
		
		//but if we change the variable : numberOfPlayerinClub to static then its gets bounded to class not object
		//so each time new object get instantiated its gets the value from the class
		
		System.out.println("After changing the variable : numberOfPlayerinClub to static");
		
		System.out.println(e1 + "" + FootBallClub.numberOfPlayerinClub);
		System.out.println(e2);
		System.out.println(e3);
		
		
	}
	
	
	
}


