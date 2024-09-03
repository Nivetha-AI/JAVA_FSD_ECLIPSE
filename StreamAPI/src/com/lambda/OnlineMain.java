package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class OnlineMain {
public static void main(String[] args) {
	Set <OnlineShopping> online= new HashSet<>();
	
	OnlineShopping o1= new OnlineShopping(101,"TV",8000.0,9.0);
	online.add(o1);
	OnlineShopping o2= new OnlineShopping(103,"Book",200.0,5.0);
	online.add(o2);
	OnlineShopping o3= new OnlineShopping(102,"Fan",1000.0,4.0);
	online.add(o3);
	OnlineShopping o4= new OnlineShopping(105,"Table",10000.0,3.0);
	online.add(o4);
	OnlineShopping o5= new OnlineShopping(106,"watch",2000.0,2.0);
	online.add(o5);
	List<OnlineShopping> onlineList = new ArrayList<>(online);
	Comparator<OnlineShopping> namesort=(OnlineShopping p1, OnlineShopping p2)->p1.getName().compareTo(p2.getName()) ;
	Collections.sort(onlineList,  namesort);
	for (OnlineShopping i : onlineList) {
		System.out.println(i.toString());
	}
	System.out.println("_____");
	Set <OnlineShopping> online1= new HashSet<>();
	OnlineShopping oo1= new OnlineShopping(101,"Book",8000.0,9.0);
	online1.add(oo1);
	OnlineShopping oo2= new OnlineShopping(103,"TV",200.0,5.0);
	online1.add(oo2);
	OnlineShopping oo3= new OnlineShopping(102,"Fan",1000.0,4.0);
	online1.add(oo3);
	OnlineShopping oo4= new OnlineShopping(105,"Table",10000.0,3.0);
	online1.add(oo4);
	OnlineShopping oo5= new OnlineShopping(106,"watch",2000.0,2.0);
	online1.add(oo5);
	List<OnlineShopping> onlineList1 = new ArrayList<>(online1);
	Comparator<OnlineShopping> pricesort=(OnlineShopping p1, OnlineShopping p2)->Double.compare(p1.getPrice(),  p2.getPrice() );
	Collections.sort(onlineList1,  pricesort);
	for (OnlineShopping i1 : onlineList1) {
		System.out.println(i1.toString());
	}
	
	
	
	
	
}
}
