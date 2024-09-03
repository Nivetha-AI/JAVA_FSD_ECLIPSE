package com.service;

abstract public class Sim {
	int noOfCalls;
	int noOfMsg;
	int bill;
	
	abstract void calling();
	
	abstract void msg();
	void show() {
		System.out.println("total bill" +bill);
	}
	

}
