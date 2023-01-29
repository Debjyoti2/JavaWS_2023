package com.java8.flatMap;

import java.util.HashSet;
import java.util.Set;

public class Developer {
	
	

	private int id;
	private String name;
	private Set<String> book;
	
	
	Developer(int id, String name, String book){
		this.id=id;
		this.name=name;
		if(this.book==null) {
			this.book = new HashSet<String>();
		}
		this.book.add(book);
	}
	
	void addBook(String book) {
		this.book.add(book);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBook() {
		return book;
	}

	public void setBook(Set<String> book) {
		this.book = book;
	}

}
