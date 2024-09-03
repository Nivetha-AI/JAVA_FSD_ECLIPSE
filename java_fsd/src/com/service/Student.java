package com.service;

import java.util.Objects;

class Student 
{
int roll;
String name;
double fee;


Student(int roll, String name, double fee) {
    this.roll = roll;
    this.name = name;
    this.fee = fee;
}


@Override
public int hashCode() {
	return Objects.hash(fee, name, roll);
}


@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", fee=" + fee + "]";
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Double.doubleToLongBits(fee) == Double.doubleToLongBits(other.fee) && Objects.equals(name, other.name)
			&& roll == other.roll;
}

}


