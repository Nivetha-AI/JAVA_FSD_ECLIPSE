package com.java.client;


import java.util.List;
import java.util.Scanner;


import com.java.Model.Student;

import com.java.demo.Service.StudentService;



public class Main {

	public static void main(String[] args) {


		StudentService ser = new StudentService();
		Scanner sc = new Scanner(System.in);
	    while (true)
	    {
	    	System.out.println("************student Info System ************");
	    	System.out.println("Press 1. to insert the student record ");
	    	System.out.println("Press 2. to delete student records ");
	        System.out.println("press 3. to select student records");
	    	System.out.println("Press 4. to Update all the employees record");
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
	    			Student s =new Student();
	    			System.out.println("enter roll no ");
	    			s.setRollno(sc.nextInt());
	    			
	    			System.out.println("enter name no ");
	    			sc.nextLine();
	    			s.setName(sc.nextLine());
	    			
	    			System.out.println("enter fee");
	    			s.setFee(sc.nextDouble());

	    			ser.addData(s);
	    			System.out.println("student added");
	    			break ;
	    			
	    		case 2:
	    		
	    			System.out.println("Enter roll no");
	    			int rollno=sc.nextInt();
	    			ser.removedata(rollno);
	    			
	    			
	    			
	    			break;
	    		case 3:
	    			List <Student> list = ser.showall();
	    			System.out.println("**********ALL EMPLOYEES *********************");
	    			System.out.println("rollno" + "    "+"name"+ "   " +" " +" fee" );
	    			//Iterate over list
	    			for (Student e:list) {
	    		    	System.out.println(e.getRollno() + "  " + e.getName()+ "  "+e.getFee());
	    		    	
	    		    }
	    			break;
	    			
	    		case 4:
	    			System.out.println("Enter roll no");
	    			int rollno1=sc.nextInt();
	    			System.out.println("Enter fee to update");
	    			double fee = sc.nextDouble();
	    			ser.Update(fee, rollno1);
	    			
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


