package com.model;
//encapsulation - hiding the instance variable
//make instance variables as private
// to make them accessible create getters and setters
public class Employee {
	
	
     private int id ;
     private String name;
     private double salary;
     private String username;
     private String password;
    // constructor name and class name should be same
     // we can create as many constructor
	public Employee(int id, String name, double salary, String username, String password) {// c1
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.username = username;
		this.password = password;
	}
	public Employee(String name, double salary, String username, String password) {//c2
		super();
		this.name = name;
		this.salary = salary;
		this.username = username;
		this.password = password;
	}
	public Employee() {//c3
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", username=" + username + ", password="
				+ password + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
	
     
}
