package com.hexa.Spring1.com.hex.spring;

public class Book {
  int bNo;
  String name;
  Double price;
public int getbNo() {
	return bNo;
}
public void setbNo(int bNo) {
	this.bNo = bNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Book(int bNo, String name, Double price) {
	this.bNo = bNo;
	this.name = name;
	this.price = price;
}
public Book() {
}
@Override
public String toString() {
	return "Book [bNo=" + bNo + ", name=" + name + ", price=" + price + "]";
}
  
}
