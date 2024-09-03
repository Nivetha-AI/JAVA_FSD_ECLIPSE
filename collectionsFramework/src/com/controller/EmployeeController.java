package com.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.exception.SqlOperationFailedException;
import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeController {
   public static void main(String[] args) {
	EmployeeService employeeService  = new EmployeeService ();  
    Scanner sc = new Scanner(System.in);
    while (true)
    {
    	System.out.println("************Employee Info System ************");
    	System.out.println("Press 1. to insert the Employee record ");
    	System.out.println("Press 2. to fetch all Employee records ");
    	System.out.println("Press 3. to Update all the employees record");
    	System.out.println("press 4. to Delete the Employee record ");
    	System.out.println("Press 0. to Exit");
    	System.out.println("**********************************************");
    	
    	int input = sc.nextInt();
    	// what if user types 0 and wants to exit ??
    	if(input ==0) {
    		System.out.println("Existing ... Thank You");
    		break;
    	}
    	switch(input){
    		case 1:
    			//if 1 is pressed , we come here ..
    			System.out.println("Enter name ");
    			sc.nextLine();
    			String name = sc.nextLine();
    			System.out.println("Enter city ");
    			String city = sc .next();
    			System.out.println("Enter salary");
    			double salary = sc.nextDouble();
    			System.out.println("Enter Department");
    			String department = sc.next();
    			
    			// insert the record in db
    			Employee emp = new Employee(name , salary , city , LocalDate.now(),department, 0);
    			
			try {
				employeeService.insertEmployee(emp);
				System.out.println("Employee inserted in DB");
			} catch (SqlOperationFailedException e1) {
				System.out.println("Insertion Error:"+e1.getMessage());
				e1.printStackTrace();
			}
			catch(Exception e){
				System.out.println("Insertion error:"+ e.getMessage());
			}	
    			
    			break ;
    			
    		case 2:
    			// if 2 is pressed , we come here
    			
    			List <Employee> list = employeeService.fetchAllEmployee();
    			System.out.println("**********ALL EMPLOYEES *********************");
    			System.out.println("ID" + "    "+"SALARY"+ "   " +" " +" NAME" );
    			//Iterate over list
    			for (Employee e:list) {
    		    	System.out.println(e.getId() + "  " + e.getSalary()+ "  "+e.getName());
    		    	
    		    }
    		    System.out.println("********* *********************");
    		    System.out.println("Do you want to order records by salary ");
    		    System.out.println("Press A for Asc order");
    		    System.out.println("press D for Desc ordee");
    		    String order = sc.next();
    		    if(!(order.equalsIgnoreCase("A") || order.equalsIgnoreCase("D"))) {
    		    	System.out.println("Invalid selection");
    		    	break;
    		    }
    		    System.out.println("Now sort by order "+ order);
    		    list= employeeService.orderEmployeeRecords(list,order);
    		    for (Employee e:list) {
    		    	System.out.println(e.getId() + "  " + e.getSalary()+ "  "+e.getName());
    		    	
    		    }
    			break;
    		case 3:
    			//if 3 is pressed , we come here..
    			System.out.println("Enter employee ID to update");
    			int eid = sc.nextInt();
    			System.out.println("Enter updated name");
    			sc.nextLine();
    			String ename = sc.nextLine();
    			System.out.println("Enter updated salary");
    			double esalary = sc.nextDouble();
    			employeeService.updateEmployee(eid , ename , esalary);
    			
    			System.out.println("Record updated");
    			break;
    		case 4:
    			// if 4 is pressed , we come here...
    			System.out.println("Enter Employee Id");
    			int id = sc.nextInt();
    			employeeService.deleteEmployee(id);
                System.out.println("Employee Deleted");
    			break;
    			
    		default: 
				//if anything other than 1-4 is pressed, we come here
				System.out.println("Invalid Input given..");
				break;

    	       }  	
     } 
    sc.close();
   }
}
