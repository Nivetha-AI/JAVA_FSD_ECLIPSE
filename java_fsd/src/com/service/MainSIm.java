package com.service;

public class MainSIm {
 public static void main(String[] args) {
	Sim s1=new Airtel();
	s1.noOfCalls = 10;
    s1.noOfMsg = 5;
    s1.calling();
    s1.msg();
    s1.show();
	
	Sim s2= new Jio();
	s2.noOfCalls = 8;
    s2.noOfMsg = 3;
    s2.calling();
    s2.msg();
    s2.show();
	
	
}
}
