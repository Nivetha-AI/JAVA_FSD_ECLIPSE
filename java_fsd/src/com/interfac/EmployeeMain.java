package com.interfac;

public class EmployeeMain {
 public static void main(String[] args) {
	 
	 
	Employee software = new Employee()
	{
	
    @Override
	public String getname() {
		
		return "Nivetha";
	}
	@Override
	public double getSlary() {
		
		return 5000000.0;
	}
	  	   
	}  ;
	

System.out.println(software.getname());	
System.out.println(software.getSlary());	



 }
}
