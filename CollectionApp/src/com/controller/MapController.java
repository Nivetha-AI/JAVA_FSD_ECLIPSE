package com.controller;

import java.util.HashMap;
import java.util.Map;

public class MapController {
public static void main(String[] args) {
	HashMap<String , Integer> map1= new HashMap<>();//POJO
	Map<String, String> map = new HashMap<>();// polymorphic
	
	map.put("harry","potter" );
	map.put("hermione","granger");
	map.put("ronald","weasley");
	System.out.println(map);
	System.out.println("**** ALL KEYS ****");
	for(String key :map.keySet()) {// map.keyset() gives u access to all keys
		System.out.println(key + " ");
	}
	
	System.out.println("\n***ALL VALUES*****");
	for (String val: map.values()) {
		System.out.println(val + " ");
	}
	
	System.out.println("\n** fetch value by key **");
	// fetch the value on the basics of given key 
	String value = map.get("harry");
	System.out.println(value);//potter
	
	value = map.get("draco");
	System.out.println(value);//null
	
}
}
