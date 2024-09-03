package com.service;

import com.exception.InsufficientFundsException;

public class DonationService {

	public void processDonation(double amount) throws InsufficientFundsException {
		if(amount <10) {
			throw new InsufficientFundsException("amount less than 10");
			
		}
		System.out.println("Donation processed");
		
	}

}
