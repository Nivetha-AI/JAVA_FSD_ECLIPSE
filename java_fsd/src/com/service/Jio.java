package com.service;

public class Jio extends Sim {

	@Override
	void calling() {
		double rate=150;
		  bill=(int) (noOfCalls*rate);
		
		
	}

	@Override
	void msg() {
		double rate1= 100;
		 bill=(int) (noOfMsg*rate1);
		
	}

}
