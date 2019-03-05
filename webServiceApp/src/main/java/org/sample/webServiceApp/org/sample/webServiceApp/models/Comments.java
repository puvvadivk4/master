package org.sample.webServiceApp.org.sample.webServiceApp.models;

import java.util.Date;

public class Comments {

	private int commentId;
	private Date commentDate;
	private String commentValue;
	
	public Comments() {
		
	}
	public Comments(int commentId, String commentValue) {
		this.commentDate=new Date();
		this.commentId = commentId;
		this.commentValue = commentValue;
	}
	
	
	public int getCommentId() {
		return commentId;
	}
	
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getCommentValue() {
		return commentValue;
	}
	public void setCommentValue(String commentValue) {
		this.commentValue = commentValue;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	
	
}
