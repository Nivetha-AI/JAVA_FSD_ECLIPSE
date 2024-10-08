package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.EmployeeReportData;
import com.exception.EmployeeNotFoundException;
import com.exception.FinanceRecordException;
import com.exception.ValidationException;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.ValidationService;

public class ManagerController {
public static void main(String[] args) {
	EmployeeService employeeService  = new EmployeeService ();
 	ValidationService validationService = new ValidationService();
     Scanner sc = new Scanner(System.in);
     
     
     System.out.println("Enter UserName: ");
	 String username = sc.next().trim();
	 try {
			validationService.validateUser(username);
			System.out.println("Enter password: ");
			int password = sc.nextInt();
			validationService.validatePassword(username, password);
			System.out.println("User verified successfully\n");
			int employeeId = validationService.getEmployeeId(username);
			String position = validationService.getPositionForEmployee(employeeId);
			System.out.println("You are a " + position);
//			if (position.trim().equalsIgnoreCase("manager")) { // case for manager
     
	while(true) {
     	System.out.println("************Employee Info System for Employee************");
     	System.out.println("Press 1. Get all the Employees by ID ");
     	System.out.println("press 2. to Generate detail report including Tax and Financial Record for Employee based on Financial year");
     	System.out.println("Press 0. to Exit");
     	System.out.println("**********************************************");
     	
     	int input = sc.nextInt();
	    
     	if(input ==0) {
     		System.out.println("Existing ... Thank You");
     		break;
     	}

     	switch(input){
     	case 1:
     		System.out.println("***SINGLE EMPLOYEE DETAILS");
			System.out.println("Enter employee Id : ");
			int emid = sc.nextInt();
			
			try {
				Employee e = employeeService.getEmployeeById(emid);
				System.out.println(e);
			} catch (SQLException e) {// if query goes wrong
				System.out.println(e.getMessage());
			}
			catch(EmployeeNotFoundException e) {// if id is invalid
				System.out.println(e.getMessage());
			}
     		break;
     		
     	case 2:
			System.out.println("Enter employee Id : ");
			int empid = sc.nextInt();
			System.out.println("Enter Financial Year (YYYY): ");
			String fyear1 = sc.next();
			int fyear = Integer.parseInt(fyear1);
			try {
				List<EmployeeReportData>  list = employeeService.getReport(empid,fyear);
				
				for (EmployeeReportData emp1: list) {
			    	System.out.println(" First Name: " + emp1.getFirstName()+" Last Name: "+emp1.getLastName()+" Taxable Income: "+
				emp1.getTaxableIncome()+" Tax Year: "+emp1.getTaxYear()+"  Tax Amount: "+ emp1.getTaxAmount()+" Record Date: "+
			    			emp1.getRecordDate()+" record Type: " +emp1.getRecordType()+" Financial Amount: "+emp1.getAmount());
			    }
			} catch (SQLException | FinanceRecordException  e) {
				System.out.println(e.getMessage());
			}
			

			break;
     	default:
     		System.out.println("Invalid Input given..");
			break;
	}//switch ends employee
	}//while ends employee
//			}//else ends
	 }//try ends
	 catch (SQLException | EmployeeNotFoundException | ValidationException e) {
			System.out.println(e.getMessage());
		}
     sc.close();
}// main ends
}// class ends


