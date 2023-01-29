package com.tcs.pwb;

import java.util.ArrayList;

public class BookRunner {

	public static void main(String[] args) {

      Book book = new Book();//calling default constructor
      Book book1 = new Book(5); //calling parameterized constructor
      
      System.out.println(book.getNoOfCopies());
      
      book.setNoOfCopies(100);
      System.out.println(book.getNoOfCopies());
      
      book.increaseNoOfCopies(100);
      System.out.println(book.getNoOfCopies());
      
      System.out.println("Byte.SIZE : " + Byte.SIZE);
      System.out.println("Integer.SIZE : " + Integer.SIZE);
      System.out.println("Character.SIZE : " + Character.SIZE);
      System.out.println("Float.SIZE : " + Float.SIZE);

      
      ArrayList<Integer> newlist = new ArrayList<Integer>();
      
		
	}

}
