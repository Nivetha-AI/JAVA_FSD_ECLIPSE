package com.controller;

import com.service.A;

public class AccessApp {

	public static void main(String[] args) {
		A a= new A(); // since A is Public 
//		B b = new b(); -- Make B public to let create its object
		int sum = a.dosum(5 , 9);
		System.out.println("sum is "+ sum );
		/*
		int sub = a.dosub(5,7);// -CF dosub in A is not public
		System.out.println("sub is " + sub);
        */
		int mul = a.domul(4, 5);
		System.out.println("mul is"+ mul);
		
	    a.setTotalmarks (500);
	    a.setMarksScored(490);
	    
	    double percent = a.computepercent();
	    System.out.println("percent is " + percent);
       
	}

}
//Ctrl + space :code suggestion or code completion- used for auto import also
	// ctrl +shift + f formatting the code indentation