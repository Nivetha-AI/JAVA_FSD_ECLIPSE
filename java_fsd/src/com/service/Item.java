package com.service;

public interface Item {
	
 
  void callbill(int price,int dis);
  
  default void sale() {
	  System.out.println("Salaes is 20%");
  }
  
}
