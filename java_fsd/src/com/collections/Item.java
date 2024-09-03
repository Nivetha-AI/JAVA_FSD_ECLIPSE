package com.collections;

public class Item {
  String name;
  double price;
  int qty;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Item(String name, double price, int qty) {
	this.name = name;
	this.price = price;
	this.qty = qty;
}
  
  public Item() {
	  
  }

public String toString() {
	return "Item [name=" + name + ", price=" + price + ", qty=" + qty + "]";
}
  
  
  
}
