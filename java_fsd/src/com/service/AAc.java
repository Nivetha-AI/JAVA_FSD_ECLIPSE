package com.service;

public class AAc implements Item{

	@Override
	public void callbill(int price, int dis) {
		int bill=price*dis;
		System.out.println("AC"+bill);
	}

}
