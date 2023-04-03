package com.pwb.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Notes_Differrence_Of_ArrayList_LinkedList {
	
	
	//arraylist holo array ri dynamik part jekhane array r size dynamically bere kome jay..
	//simple array a size fixed hoy , tai kono element insert delete korte onk jhamela.sejonno arraylist use kora hy
	
	
	//linked list hlo jekhane element gulo next element er address diye represent hoy..
	//example : let 5th elemt >100
			//      6th element > 200
	//ebr jodi 5th and 6th er majhe r ekta element dhokai then 6th element ke ekta shift korte hbe..
	//jehetu sobay previuous element r upor depend kore address pay tai ekta element dhokale next element ta automatically shift hoye jbe
	
	
	//but arraylist e next sob kota element ke 1 ghor shift hote hbe
	
	//tai jodi list e onk add korte hoy remove korte hoy , but besi element majkhan theke dhokate na hoy then use arraylist, add joldi hoy
	//and get(index) joldi hoy
	
	//linked list e supose 100th element get korte chai...then 1st e 1st element , sekhan theke 2nd , then 3rd kore 100th element debe,
	//onk time lagbe...but araylist e get(100) korle ekbare diye dbe.
	
	
	//but jodi besi majkhan theke dhokate ber korte hoy...then use linked list
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		
	}
	

}
