package com.controller;

import java.util.Scanner;

import com.service.CalculatorService;

public class CalculatorApp {
       public static void main(String[] args) {
		CalculatorService calcService = new CalculatorService();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Numerator");
		int n1=sc.nextInt();
		
		System.out.println("Enter Demoninator");
		int n2 = sc.nextInt();
		
		try {
			double result =calcService.divop( n1,n2);
			System.out.println("Result is "+ result);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured: "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception occured: "+e.getMessage());
		}
		sc.close();
         System.out.println("Thank you ");
		}
}
