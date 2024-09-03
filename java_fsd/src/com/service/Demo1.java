package com.service;


public class Demo1 {
public static void main(String[] args) {
//	Calculate sum=(a,b)->(a+b);
//	System.out.println(sum.operate(10, 20));
//	
//	Calculate sub=(a,b)->(a-b);
//	System.out.println(sub.operate(20, 10));
//	
//	Calculate mul=(a,b)->(a*b);
//	System.out.println(mul.operate(110, 10));
	Item tv= new Tv();
	tv.callbill(38,97);
	tv.sale();
	Item Ac= new AAc();
	Ac.callbill(300, 4);
	tv.sale();
}
}
