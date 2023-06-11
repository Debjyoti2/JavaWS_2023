package com.string.puzzle;

public class StringQstn {
	
	//== operator checks the memory address
	//.equals() method check the content inside the string
	
	/*
	
	String is immutable bcs of the security reasons. as its immutable its cant be changed once assigned.
	so we can use db username, password in string . that cant be modified by the hacker once created.
	
	*/
	
	public static void main(String[] args) {
		
		 String str1  = "Apple";  
		 String  str2 = "Apple";
		 
		 str1.concat("adddd"); //new literal created  in string constant pool  Appleadddd;
		 
		 //but still the value of str1 is Apple as str1 points to original literal Apple in SCP.
		 
		 //now once concat the value and also change the pointing  
		 str1 = str1.concat("cc");
		 //now str1 will have value Applecc;
		
		 //1. == operator checks the memory address
		 //same content er jonno string constant pool e ektai object create hoy,str1,str2 both same object kei point kore.
		 //here both are allocated inside String Constant Pool inside JVM, so both have same memory location.
		 boolean flag = str1==str2?true:false;
		 System.out.println("Result is :: " + flag); //true
		 
		 
		 //2. .equals() method chkek the content inside the string so it return true obviously as both have same content
		 boolean flag2 = str1.equals(str2)?true:false;
		 System.out.println("Result2 is :: " + flag2); //true
				 
		 
		 
		 String str3 = new String("ABC"); //created new String with new keyword, so it will create a new object in JVM Heap memory.
		 String str4 = "ABC";
		
		 //3. Now check with == if both belongs to same address
		 boolean flag3=str3==str4?true:false;
		 System.out.println("Result3 is :: " + flag3); //false
		 
		 //4. though they belongs to differrent memory location , but content is same, as .equals() method check only content so result is true
		 boolean flag4 = str3.equals(str4)?true:false;
		 System.out.println("Result4 is :: " + flag4); //true
		 
		 
		 
		 //1st e "Kittu" bole ekta var create jorbe SCP te, diye str5 ke point korabe
		 //thne "Sonay" bole create korte bolbe var, JVM dekhbe already ei var content ta SCP te ache kina , nei tai 
		 // new var create korbe and str6 ke point korabe
		 
		 //tai == korbe address alada tai false debe
		 //content diff tai .equals() o false debe
		 String str5="Kittu";
		 String str6="Sonay";
		 boolean flag5=str5==str6?true:false;
		 System.out.println("Value is :" + flag5);
		 
		 
		 //How many object got create by below line of code??
		 String s1 = new String("Level");
		 //answer is 2, 1st one is created in heap memory as new keyword is present.
		 //another one will also get created in String Constant Pool(SCP) by JVM for future reusability perpouse.
		 
		 
		 
		 String s7="ABC";
		 s7="CED";
		 System.out.println("String S7 is ::" + s7);
		 
		 String s8="PQR";
		 s8=s8+"STU";
		 System.out.println("String S8 is ::" + s8);
		 
		 
		 
		 //System.gc();  ask JVM to do garbage collection
		 
		 
		 //string is immutable
		 
		 String s9 = new String("TEST"); // created a new object "TEST" in Heap Memory, pointing to s9 
		 System.out.println(s9.concat("123")); // as string is immutable , so not changing anything in "TEST", creating a new variable "TEST123".
		 System.out.println("S9 is " + s9); // s9 is still "TEST" as we have not changed the pointing of s9
		 
		 s9=s9.concat("123"); //now we are changing the pointing of s9 ..so now it will points to "TEST123".
		 System.out.println("Now S9 is " + s9);
		 
		
		
	}
	
	

}
