package com.tcs.pwb;

public class NewBookRunner {

	public static void main(String[] args) {
		
		Author author= new Author("Kittu",31);
		NewBook book = new NewBook(100,"I Love You",author);
		book.addReview();
		book.printAll();

	}

}
