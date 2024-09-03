package com.service;

public class A {
	
	int totalmarks ;// instance variable
	int marksscored;// instance variable

	public int dosum(int i, int j) {

		return i + j;
	
	}

	int dosub(int i, int j) { // default method
		
		return i-j;
	}

	public int domul(int i, int j) {
		
		return i*j;
	}

	public void setTotalmarks(int totalmarks) {// local variable
		
	 this.totalmarks =totalmarks;
	}

	public void setMarksScored(int marksscored) {//local variable
	 this.marksscored = marksscored	;
		
	}

	public double computepercent() {
	
		double percent = (this .marksscored*100)/this.totalmarks;
		return percent;
	}

}
