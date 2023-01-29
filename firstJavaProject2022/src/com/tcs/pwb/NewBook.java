package com.tcs.pwb;

import java.util.ArrayList;

public class NewBook {
	
	private int id;
	private String name;
	private Author author;
	private ArrayList<BookReview> reviews = new ArrayList<BookReview>();
	
	NewBook(int id,String name,Author author){
		this.id=id;
		this.name=name;
		this.author=author;
	}
	
	public void printAll() {
		System.out.println("Book Id is ::" + id);
		System.out.println("name is :: " + name);
		System.out.println("author is :: " + author.getAuthorName() + author.getAge());
		for(BookReview review : reviews) {
			System.out.println("Reviews ::: " + review.getReviewId() + review.getReviewDesc() + review.getReviewRating());
		}
		
	}
	
	public void addReview() {
		BookReview review1 = new BookReview(100,"A",2);
		reviews.add(review1);
		BookReview review2 = new BookReview(101,"B",3);
		reviews.add(review2);
		
	}

}
