package com.hexa.Spring1.com.hexa.spring1;

public class Cart {
  int qty;
  double bill;
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getBill() {
	return bill;
}
public void setBill(double bill) {
	this.bill = bill;
}
@Override
public String toString() {
	return "Cart [qty=" + qty + ", bill=" + bill + "]";
}
  
}
