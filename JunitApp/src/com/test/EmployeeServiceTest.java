package com.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.exception.ResourceNotFoundException;
import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeServiceTest {
     EmployeeService employeeService=new EmployeeService();
	@Test
	public void  getEmployeeByIdTest() {
		// use case 1: valid ID
		Employee e1=new Employee(1,"Nivetha",5000000,"IT");
		Employee e2=new Employee(2,"Varsha",4000000,"ADMIN");
		Employee e3=new Employee(3,"Ramaa",3000000,"MANAGEMENT");
		Employee e4=new Employee(4,"Visha",2000000,"IT");
        
		List<Employee> list=new ArrayList<>();
		list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        int id=3;
        Employee expectedoutput=new Employee(3,"Ramaa",3000000,"MANAGEMENT");
       
          
        	try {
				Assert.assertEquals(expectedoutput , employeeService.getEmployeeById(list, id));
			} catch (ResourceNotFoundException e) {}
         //use case 2 :Invalid ID  
           id=5;
           try {
			Assert.assertEquals(expectedoutput , employeeService.getEmployeeById(list, id));
		} catch (ResourceNotFoundException e) {
			Assert.assertEquals("Invalid ID Given".toLowerCase(), e.getMessage().toLowerCase());
		}
	}
}
