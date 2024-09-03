package com.hexa.Spring1.com.hexa.spring1;

public class Product {
  String name;
  double price;
  Cart car;
  
public Cart getCar() {
	return car;
}
public void setCar(Cart car) {
	this.car = car;
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
@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + "]";
}
  

}
