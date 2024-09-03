package com.fsd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Productmain {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		Product p1 = new Product(104, 200.9, "pen");
		products.add(p1);

		Product p2 = new Product(103, 400.9, "notebook");
		products.add(p2);

		Product p3 = new Product(102, 800.9, "book");
		products.add(p3);
		Product p4 = new Product(101, 700.9, "book");
		products.add(p4);

		// normal method
//    for(Product p:products) {
//    	System.out.println(p.toString());
//    }

// stream Api lambda method

//		products.stream().forEach((temp) -> System.out.println(temp.toString()));// all
//		System.out.println("______");
//		products.stream().filter((t)->t.getCode()==102).forEach((temp) -> System.out.println(temp.toString()));// filter
//		System.out.println("______");
//		// show all the book items deatails
//        products.stream().filter((t)->t.getName().contains("book")).forEach((temp)-> System.out.println(temp.toString()));// only 

//		List a1=products.stream().filter((temp)->temp.getName().contains("book")).collect(Collectors.toList());
//		System.out.println(a1);

		// sort using comparable
		// Collections.sort(products);

		// sort using comparator-code
		//Collections.sort(products, new codecomparator());
		//sort using lamba without creating interface-code
		Comparator<Product> codecom=(Product o1, Product o2)->o1.getCode()- o2.getCode();
		
		Collections.sort(products,  codecom);
		for (Product p : products) {
			System.out.println(p.toString());
		}
		System.out.println("----------");
		List<Product> products1 = new ArrayList<>();
		Product pp1 = new Product(104, 200.9, "pen");
		products1.add(pp1);

		Product pp2 = new Product(103, 400.9, "notebook");
		products1.add(pp2);

		Product pp3 = new Product(102, 800.9, "book");
		products1.add(pp3);
		Product pp4 = new Product(101, 700.9, "tv");
		products1.add(pp4);
		
		
		
		// sort using comparator- name
		//Collections.sort(products1, new NameComaparator());
		//sort using lamba without creating interface-code
		Comparator<Product> numcom=(Product o1, Product o2)->o1.getName().compareTo(o2.getName());
		Collections.sort(products1,  numcom);

		for (Product i : products1) {
			System.out.println(i.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
