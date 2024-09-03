package com.service;
public class Tv implements Item{



	@Override
	public void callbill(int price, int dis) {
		int bill=price*dis;
		System.out.println("Tv"+bill);
		
	}

}
