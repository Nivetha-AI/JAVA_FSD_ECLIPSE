package com.dto;

public class EventBookedDto {
	private String eventName;
	private int totalTicketsBooked;
	public EventBookedDto() {}
	public EventBookedDto(String eventName, int totalTicketsBooked) {
		this.eventName = eventName;
		this.totalTicketsBooked = totalTicketsBooked;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getTotalTicketsBooked() {
		return totalTicketsBooked;
	}
	public void setTotalTicketsBooked(int totalTicketsBooked) {
		this.totalTicketsBooked = totalTicketsBooked;
	}
	@Override
	public String toString() {
		return "EventBookedDto [eventName=" + eventName + ", totalTicketsBooked=" + totalTicketsBooked + "]";
	}

	
	
}
