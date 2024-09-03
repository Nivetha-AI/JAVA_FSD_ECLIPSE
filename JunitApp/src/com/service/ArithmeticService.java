package com.service;

import java.util.Collections;
import java.util.List;

public class ArithmeticService {
//we test service method by unit
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
    public int sumOfArray(int[] arry) {
    	int sum =0;
    	for(int e:arry) {
    		sum=sum+e;
    	}
    	return sum;
    }
    public List<Integer> sortList(List<Integer> list, String direction){
    	if(direction.equalsIgnoreCase("ASC")){
    		Collections.sort(list);
    	}
    	if(direction.equalsIgnoreCase("DESC")) {
    		Collections.sort(list);
    		Collections.reverse(list);
    	}
    	return list;
    }
}
