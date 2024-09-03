package com.controller;

import java.util.Scanner;
import com.service.MarksService;
import com.exception.InvalidMarksException;

public class MarksController {
public static void main(String[] args) {
	MarksService marksService = new MarksService();
	Scanner sc = new Scanner(System.in);
	Double [] marks = new Double[3];
	
	for(int i=0;i<3;i++) {//i=0,1,2
		System.out.println("Enter marks for subject"+(i+1)+": ");
		marks[i]=sc.nextDouble();
		
	}
	double totalMarks=300;
	try {
	String grade=marksService.computeGrade(marks, totalMarks);
	System.out.println("your grade is " + grade);
	}
	catch(InvalidMarksException e) {
		System.out.println(e.getMessage());
	}
	sc.close();
}
}
