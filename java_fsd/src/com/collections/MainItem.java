package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainItem {
   public static void main(String[] args) {
	   
	   Scanner sc= new Scanner(System.in);
	List<Item> items= new ArrayList<>();
	
	
	Item i1= new Item("dsa",800.0,1000);
	items.add(i1);
	Item i2= new Item("C++",700.0,100);
	items.add(i2);
	Item i3= new Item("java",1000.0,20);
	items.add(i3);
	Item i4= new Item("react",400.0,2000);
	items.add(i4);
	Item i5= new Item("js",600.0,2000);
	items.add(i5);
	boolean flag = false;
	System.out.println("Enter book name :");
	String name= sc.nextLine();

	for(Item i :items) {
		
		if (i.getName().equalsIgnoreCase(name)) {
			System.out.println("Enter qty to purchase");
			int userqty=sc.nextInt();
			sc.nextLine();
			if(userqty<=i.getQty()) {
				flag=true;
				System.out.println(i.getName()+" quantity availble. Do you want to puchase(y/n)");
				String response=sc.nextLine();
				if(response.equalsIgnoreCase("y")) {
					double bill= userqty*i.getPrice();
					System.out.println("total bill for "+ userqty+"is :"+bill);
				}
				else {
					System.out.println("not purchased");
				}
				
			}
			else {
				System.out.println("requested qty is not available"+i.getQty()+"are available");
			}
			
			
			flag=true;
			break;
			
		}
	}
		if(flag==false) {
			System.out.println("book not found");
		}
		
	}
	
}
	
	
	
	
	

