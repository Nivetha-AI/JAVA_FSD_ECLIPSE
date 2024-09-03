package com.exception;

public class NullReferenceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
    public NullReferenceException (String message) {
    	this.message = message;
    }
	
	
    @Override
   public String getMessage() {
	
	return message;
}
}
