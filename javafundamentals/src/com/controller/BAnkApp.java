package com.controller;

import com.service.EmailService;
import com.service.LoanService;

public class BAnkApp {

	public static void main(String[] args) {
		LoanService loanservice = new LoanService();
		String fname = "Nive ";
		String lname = "T";
		String name = loanservice.computeloan(fname , lname);
		System.out.println("loan processed for " + name );
		
		
		EmailService emailservice = new EmailService();
		
	    name = emailservice.sendemail(fname,lname);
		System.out.println("email sent to " + name );
		
		
		

	}

}
