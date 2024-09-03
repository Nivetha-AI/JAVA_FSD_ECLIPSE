package com.model;

public class ItemDonation extends Donation{
	private String ItemType;

	public ItemDonation(String itemType) {
		ItemType = itemType;
	}

	public ItemDonation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemDonation(String donorName, double amount) {
		super(donorName, amount);
		// TODO Auto-generated constructor stub
	}
	
	public String getItemType() {
		return ItemType;
	}

	public void setItemType(String itemType) {
		ItemType = itemType;
	}

	public void RecordDonation() {
		
	}

}
