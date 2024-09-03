package com.hexa.Springannotation.com.hexa.Springannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
 int Roll;
 String Name;
 Double Fee;
 @Autowired
 Result res;
public Result getRes() {
	return res;
}
public void setRes(Result res) {
	this.res = res;
}
public int getRoll() {
	return Roll;
}
public void setRoll(int roll) {
	Roll = roll;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}
public Double getFee() {
	return Fee;
}
public void setFee(Double fee) {
	Fee = fee;
}
public Student(int roll, String name, Double fee) {
	Roll = roll;
	this.Name = name;
	Fee = fee;
}
public Student() {
}

void init() {
	System.out.println("before object is created");
}
void destroy() {
	System.out.println("After finishing the work");
}
@Override
public String toString() {
	return "Student [Roll=" + Roll + ", name=" + Name + ", Fee=" + Fee + "]";
}
 
 
}
