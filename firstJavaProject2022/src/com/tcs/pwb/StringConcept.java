package com.tcs.pwb;

public class StringConcept {

	public static void main(String[] args) {
		//string is a immutable object
		//string  is immutable object but StringBuffer,StringBuilder are mutable object
		
		String a="abc";
		String b=a.concat("def");
		System.out.println("String a is : " +a);
		System.out.println("String b is : " + b);
		
		
		System.out.println("\nString contains function");
		if(a.contains("Z")) {
			System.out.println("Print Present");
		}
		else {
			System.out.println("Print not Present");
		}
		
		
		System.out.println("\nString indexOf function");
		if(a.indexOf("a")!=-1) {
			System.out.println("Print Present");
		}
        else {
			System.out.println("Print not Present");
		}
		
		
		System.out.println("\nString join function");
		String c=a.join("*","A","B","C","D");
		System.out.println("String c is : " + c);
		
		
		
		System.out.println("\nString substr function");
		String d="I am a good boy";
		String e =d.substring(0,4);//print i am
		System.out.println("String e is : " + e);
		
		System.out.println("\nString replace function");
		String f="abcde";
		String g=f.replace("b","c");
		System.out.println("String g is : " + g);
		
		
		//string  is immutable object but StringBuffer is mutable object
		System.out.println("\nStringBuffer class");
		StringBuffer bf = new StringBuffer("ABC");
		bf.append("DEF");
		bf.reverse();
		System.out.println(bf);
		
		
		//Stringbuilder is also same .. Stringbuffer is threadsafe so takes lots of memory
		//stringbuilder does not take lots of memory
		//so user stringbuilder
		System.out.println("\nStringBuilder class");
		StringBuilder sbb = new StringBuilder("ABCDE");
		sbb.append("DFFGGGDF");
		System.out.println(sbb);
	}

}
