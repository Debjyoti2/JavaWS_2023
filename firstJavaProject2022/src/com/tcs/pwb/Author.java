package com.tcs.pwb;

public class Author {

	private String authorName;
	private int age;
	
	Author(String authorName,int age){
		this.authorName=authorName;
		this.age=age;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
