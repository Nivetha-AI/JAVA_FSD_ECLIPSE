package com.model;

import java.util.Objects;

public class Employee {
  private int id;
  private String name;
  private double salary;
  private String department;
public Employee() {}
public Employee(int id, String name, double salary, String department) {
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.department = department;
}
public Employee(String name, double salary, String department) {
	this.name = name;
	this.salary = salary;
	this.department = department;
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
}
@Override
public int hashCode() {
	return Objects.hash(department, id, name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name)
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}
  
}
