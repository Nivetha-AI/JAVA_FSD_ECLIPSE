package com.service;

public class Demosim1 {
public static void main(String[] args) {
	Sim1 vodafone=(noOfcalls)->(noOfcalls*2);
	System.out.println(vodafone.calBill(5));
	Sim1 airtel=(noOfcalls)->(noOfcalls*5);
	System.out.println(airtel.calBill(10));
}
}
