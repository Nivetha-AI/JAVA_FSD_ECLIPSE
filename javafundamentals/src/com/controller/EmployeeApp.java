package com.controller;

import com.model.Employee;

public class EmployeeApp {
    public static void main(String[] args) {
		Employee e1 = new Employee(1, "harry",34000, "harry@gmail.com","1234");//constructor 1
		Employee e2 = new Employee();// constructor 3
//		e2.setid(1) - it will auto generate
		e2.setName("ronald");
		e2.setSalary(400000);
		e2.setUsername("ron@gmail.com");
		e2.setPassword("123");
		
		
		
		Employee e3=new Employee("hermione", 5400 , "heer@gmail.com","12");//constructor 2
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		// if we do not add to string it will display the memory address of e1 , e2 , e3
	}
}
