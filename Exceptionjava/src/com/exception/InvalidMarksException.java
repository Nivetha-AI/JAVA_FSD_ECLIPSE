package com.exception;

public class InvalidMarksException extends Exception {

	private static final long serialVersionUID = 1L;
    private String message;
    public InvalidMarksException(String message) {
    	this.message = message;
    }
	
	
    @Override
   public String getMessage() {
	
	return message;
}
}
