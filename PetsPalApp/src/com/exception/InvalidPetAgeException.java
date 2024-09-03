package com.exception;

public class InvalidPetAgeException extends Exception {


	private static final long serialVersionUID = 1L;
	private String message;
    public InvalidPetAgeException (String message) {
    	this.message = message;
    }
	
	
    @Override
   public String getMessage() {
	
	return message;
}
}
