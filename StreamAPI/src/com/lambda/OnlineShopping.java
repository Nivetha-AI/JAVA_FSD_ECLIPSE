package com.lambda;

public class OnlineShopping {
  int code;
  String name;
  double price;
  
  double qty;

public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

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

public double getQty() {
	return qty;
}

public void setQty(double qty) {
	this.qty = qty;
}

public OnlineShopping(int code, String name, double price, double qty) {
	this.code = code;
	this.name = name;
	this.price = price;
	this.qty = qty;
}

public OnlineShopping() {
}

@Override
public String toString() {
	return "OnlineShopping [code=" + code + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
}
  
}
