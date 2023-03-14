package com.javareflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CatReflection {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {

     //Type1.
	 Class mycat = Cat.class;
	
	 //Type2.
	 //Cat obj = new Cat();
	 //Class mycat = obj.getClass(); 
	 
	 //Type3.
	 //Class mycat = Class.forName("com.javareflection.Cat");
     
	 
     String className = mycat.getClass().toString();
     String className2 = mycat.getName();
     String className3 = mycat.getSimpleName();
     
     System.out.println("ClassName is :: " + className + " ::: " + className + "  :::  " + className3);
     
     
     
     Field catFileds[] = mycat.getDeclaredFields();
     Method catMethods[] =mycat.getDeclaredMethods();
     
     for(Field f : catFileds) {
    	 System.out.println("Fields are :: " + f.getName());
     }
     for(Method m : catMethods) {
    	 System.out.println("Method are :: " + m.getName());
     }
     
    
     
    //invoking a method of a class outside of a class without creating object
     
    Method myusableMethod =null; 
    for(Method specificMethod :catMethods) {
    	if(specificMethod.getName().equalsIgnoreCase("methodtoInvoke")) {
    		myusableMethod = specificMethod;
    		break;
    	}
    }
    myusableMethod.setAccessible(true);
    myusableMethod.invoke(new Cat(), "AA","BB");	

	}

}
