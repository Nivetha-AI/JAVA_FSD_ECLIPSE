package com.controller;

import com.service.memoryservice;

public class memoryapp {

	 public static void main(String[] args) {
		memoryservice ms1 = new memoryservice();
		memoryservice ms2 = new memoryservice();
		
		ms1.setX(10);
		ms1.setY(3);
		
		System.out.println(ms1.getX());//10
		System.out.println(ms2.getX());//5
		
		System.out.println(ms1.getY());// 3
		System.out.println(ms2.getY());// 0
		
		
		System.out.println(ms1);// memeory location hexa decimal -5acf9800
		System.out.println(ms2);//4617c264
	}
}
