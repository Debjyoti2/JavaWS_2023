package com.tcs.pwb;

public class BookReview {

	private int reviewId;
	private String reviewDesc;
	private int reviewRating;
	
	BookReview(int reviewId,String reviewDesc,int reviewRating){
		this.reviewId=reviewId;
		this.reviewDesc=reviewDesc;
		this.reviewRating=reviewRating;
	}
	
	public int getReviewId() { 
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewDesc() {
		return reviewDesc;
	}
	public void setReviewDesc(String reviewDesc) {
		this.reviewDesc = reviewDesc;
	}
	public int getReviewRating() {
		return reviewRating;
	}
	public void setReviewRating(int reviewRating) {
		this.reviewRating = reviewRating;
	}
	
	
	
}
