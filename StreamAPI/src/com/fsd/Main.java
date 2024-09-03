package com.fsd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {
	
	
	List<String> users = new ArrayList<>();
	users.add("Nive");
	users.add("ramya");
	users.add("priya");
	users.add("Nithila");
	users.add("nithya");
	users.stream().forEach((temp)-> System.out.println(temp));
	
	System.out.println("-------------");
	// condition
	users.stream().filter((t)->t.startsWith("N")).forEach((temp)->System.out.println(temp));
	System.out.println("__-");
    users.stream().filter((t)->t.endsWith("a")).forEach((temp)->System.out.println(temp));
	long c=users.stream().filter((t)->t.length()>4).count();
	System.out.println(c);
	
	
	
	System.out.println("-------------------");
	
	List<Integer> al= new ArrayList<>();
	al.add(22);
	al.add(42);
	al.add(28);
	al.add(67);
	
	al.stream().forEach((t)->System.out.println(t));
	
	
	// filter condition
	al.stream().filter((e)->e%2==0).forEach((t)->System.out.println(t));
	
	
	
	
	// normal method
	/*for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	
	
	for(Integer i : al)
	{
		System.out.println(i);
	}*/
	
	List <String>users1=new ArrayList<String>();
	
	users1.add("Asha sharma");
	users1.add("pooja gupta");
	users1.add("kavita gupta");
	users1.add("Ajay sharma");
	users1.add("deepa sharma");
	
	users1.stream().filter((t)->t.contains("sharma")).forEach((temp)->System.out.println(temp));
	
	
	System.out.println("____________________");
	
	List<Integer> emp= new ArrayList<>();
	
	
	emp.add(3000000);
	emp.add(4000);
	emp.add(600000);
	emp.add(6666600);
	// to store the list
	// for each only display but to store we use collector.toList()
	List a1= emp.stream().map((t)->t*12).collect(Collectors.toList());// map to calculate value
	System.out.println(a1);
	List a2= emp.stream().filter((t)->t>10000).collect(Collectors.toList());// filter condition
	
	System.out.println(a2);
	
	
}}