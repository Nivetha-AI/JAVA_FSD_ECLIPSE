package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringBufferApp {
public static void main(String[] args) {
	
	
	StringBuilder sb=new StringBuilder("Hello ");  
	sb.append("Java");//now original string is changed  
	System.out.println(sb);//prints Hello Java  
	List <String> fruits= new ArrayList<>();
    fruits.add("banana");
    fruits.add("orange");
    fruits.add("apple");

    fruits.add("mango");
    fruits.add("pineapple");
    
    Collections.sort(fruits);

	System.out.println(fruits );
}
}
