package com.model;

public class Customer {
 private int id;
 private String CustomerName;
 private String email;
 private String phoneNumber;
public Customer() {}
public Customer(int id, String customerName, String email, String phoneNumber) {
	this.id = id;
	CustomerName = customerName;
	this.email = email;
	this.phoneNumber = phoneNumber;
}
public Customer(String customerName, String email, String phoneNumber) {
	CustomerName = customerName;
	this.email = email;
	this.phoneNumber = phoneNumber;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", CustomerName=" + CustomerName + ", email=" + email + ", phoneNumber=" + phoneNumber
			+ "]";
}


 
 
}
