package org.sample.webServiceApp.org.sample.webServiceApp.exceptions;

public class ErrorMessage {
	
	String errorMessage;
	int errorCode;
	String doc;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public ErrorMessage(String errorMessage, int errorCode, String doc) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.doc = doc;
	}
	public ErrorMessage() {
		super();
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	} 

}
