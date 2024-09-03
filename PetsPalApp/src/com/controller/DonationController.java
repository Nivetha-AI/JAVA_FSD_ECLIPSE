package com.controller;

import java.util.Scanner;

import com.exception.InsufficientFundsException;
import com.service.DonationService;

public class DonationController {
  public static void main(String[] args) {
	DonationService donationService=new DonationService();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter donation amount");
	double amount= sc.nextDouble();
	
	try {
		donationService.processDonation(amount);
	} catch (InsufficientFundsException e) {
	System.out.println(e.getMessage());
	}
}
}
