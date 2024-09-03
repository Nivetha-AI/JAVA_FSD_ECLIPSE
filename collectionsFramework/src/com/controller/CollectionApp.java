package com.controller;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class CollectionApp {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		
		List <Integer> list = new ArrayList<>();//Poly
		list.add(4);
		list.add(3);
		list.add(7);
		
		// creating list using Array class
		List<Integer> list2 = Arrays.asList(1,4,2,5,7,3,9);
		
		//Iterate the list
		for(int x : list) {
			System.out.println(x + " ");// [4,7]
			
		}
		
		System.out.println("****************removing the list**************");
		list.remove(1);
		for(int x : list) {
			System.out.println(x + " ");// [4,7]
			
		}
		
		System.out.println("***************Fetch an elemennt*****************");
        list.add(2);
        list.add(9);//{4,7,2,9]
        int e=list.get(1);/// Element at index 1
        System.out.println("Element at index 1 :"+e);
        
        System.out.println("sorting the list");
        Collections.sort(list);
        System.out.println(list);//{2,4,7,9]
        
        
        Collections.reverse(list);
        System.out.println(list);//[9,7,4,2]
        
        System.out.println("Searching from the list");
        Collections.sort(list);
        int pos=Collections.binarySearch(list, 4);//1
        System.out.println("Element 4 is at index :"+pos);
        
        
        
        
        
        
        
        
        
	}

}
