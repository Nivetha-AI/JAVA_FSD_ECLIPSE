package com.model;

import java.time.LocalDate;

public class CashDonation extends Donation{
private LocalDate donationDate;

public CashDonation(LocalDate donationDate) {
	this.donationDate = donationDate;
}

public CashDonation() {
}

public CashDonation(String donorName, double amount) {
	super(donorName, amount);
	
}

public LocalDate getDonationDate() {
	return donationDate;
}

public void setDonationDate(LocalDate donationDate) {
	this.donationDate = donationDate;
}

public void RecordDonation() {
	
}
}
