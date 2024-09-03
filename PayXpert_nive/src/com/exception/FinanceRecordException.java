package com.exception;

public class FinanceRecordException extends Exception{

	private static final long serialVersionUID = 1L;
	private String message;
    public FinanceRecordException(String message) {
    	this.message = message;
    }
	
	
    @Override
   public String getMessage() {
	
	return message;
}
}
