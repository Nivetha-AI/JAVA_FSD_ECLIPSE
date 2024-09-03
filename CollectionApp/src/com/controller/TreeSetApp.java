package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {
  public static void main(String[] args) {
	List<Integer>list = new ArrayList<>();
	list.add(2);
	list.add(4);
	list.add(1);
	list.add(null);
	list.add(2);
	System.out.println(list);//[2,4,1,null,2]
	
	TreeSet<Integer> treeset = new TreeSet<>();//pojo
	Set <Integer> set= new TreeSet<>();
	
	set.add(2);
	set.add(4);
	set.add(1);
	System.out.println(set);//[1,2,4]
	//set sorts the element in ASC order by default
	
	//y list not set ?
	//set.add(null);//if nu is presenet in Db it breaks.
	//null pointer Exception
	
	//set ignores duplicates
	set.add(2);
	System.out.println(set);//[1,2,4]
}
}
