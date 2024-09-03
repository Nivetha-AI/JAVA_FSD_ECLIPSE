package com.service;

public class Airtel extends Sim {
    
	@Override
	void calling() {
		double rate=100;
		 bill=(int) (noOfCalls*rate);
		
	}

	@Override
	void msg() {
	
		double rate1= 50;
		bill=(int) (noOfMsg*rate1);
	}

}
