package com.model;

import java.time.LocalDate;

public class Employee {
  private int id;
  private String name;
  private double salary;
  private String city;
  private LocalDate dateOfJoining;
  private String department;
  private int managerId;
  
  //constructors



public Employee() {// no args
}

public Employee(int id, String name, double salary, String city, LocalDate dateOfJoining, String department,
		int managerId) {// all argument
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.city = city;
	this.dateOfJoining = dateOfJoining;
	this.department = department;
	this.managerId = managerId;
}
// without id constructor
public Employee(String name, double salary, String city, LocalDate dateOfJoining, String department, int managerId) {
	this.name = name;
	this.salary = salary;
	this.city = city;
	this.dateOfJoining = dateOfJoining;
	this.department = department;
	this.managerId = managerId;
}


//getters and setters


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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public LocalDate getDateOfJoining() {
	return dateOfJoining;
}

public void setDateOfJoining(LocalDate dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public int getManagerId() {
	return managerId;
}

public void setManagerId(int managerId) {
	this.managerId = managerId;
}
// to String

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + ", dateOfJoining="
			+ dateOfJoining + ", department=" + department + ", managerId=" + managerId + "]";
}

  
 // Employee employee = new Employee();
// no arg for when we set the value 

}
