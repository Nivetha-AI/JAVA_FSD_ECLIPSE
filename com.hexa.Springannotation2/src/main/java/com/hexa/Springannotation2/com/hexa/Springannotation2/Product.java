package com.hexa.Springannotation2.com.hexa.Springannotation2;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	String name;
	  double price;
	  @Autowired
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
	void init() {
		System.out.println("before object is created");
	}
	void destroy() {
		System.out.println("After finishing the work");
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	  
}
