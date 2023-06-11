package com.WAP.One_class_extends_two_class_same_method;

public class Test2 {
	
	public static void main(String[] args) {
		
		String s =null;
		
		try {
			char c = s.charAt(4);
		}
//		catch(Exception e) {  unrechable code ,, compile error
//        	System.out.println("In Exception block");
//		}
		catch(NullPointerException e) {
			System.out.println("In NullPointerException block");
		}
        catch(Exception e) {
        	System.out.println("In Exception block");
		}
		finally {
			System.out.println("In finally block");
		}
		
	}
	
	
	
	

}
