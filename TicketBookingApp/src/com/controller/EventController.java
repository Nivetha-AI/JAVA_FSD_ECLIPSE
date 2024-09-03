package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.EventBookedDto;
import com.dto.EventRevenueDto;
import com.exception.InvalidIdException;
import com.model.Customer;
import com.model.Event;
import com.service.EventService;


public class EventController {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		EventService eventService  = new EventService ();
		while (true) {
		System.out.println("*********** Event ops ***********");
		System.out.println("Press 1. To calculate total revenue");
		System.out.println("Press 2. Booked ticket Details");
		System.out.println("Press 3. Book the ticket");
		System.out.println("Press 0 for exit");
		System.out.println("************************************");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("Exiting .. Thank you !!");
			break;
		}//if ends
		
		switch(input) {
		case 1:
			try {
			List<EventRevenueDto> list = eventService.getRevenueByEvent();
			for(EventRevenueDto dto :list) {
				System.out.println(dto.getEventName()+"\t"+(dto.getTotalRevenue()/10000000)+ "Cr" );
			}
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Gross Total Revenue: "+eventService.getGrossTotalRevenue(list) / 10000000 + "cr \n");
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			// we compute total booking done 
			
			try {
				List<EventBookedDto>list = eventService.getTicketsBookedByEvent();
				System.out.println("Event_name" + "                 "+ "Total_tickets_Booked");
				for(EventBookedDto dto :list) {
					
					System.out.println(dto.getEventName()+"\t\t\t"+(dto.getTotalTicketsBooked()));
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
			break;
		case 3:
			System.out.println("Enter your ID: ");
			int customerId = sc.nextInt();
			try {
				//step 1:validate customerid
				Customer customer = eventService.validateCustomerId(customerId);
				System.out.println(customer);
				// step 2:Show event details and read ID :eventID
				List<Event> list = eventService.fetAllEvents();
				for (Event e:list) {
					System.out.println(e.getId()+ "\t\t"+e.getEventName()+"\t\t"+"Available seats :"+e.getAvailableSeats()
					+"\t\t"+"Ticket price/person"+e.getTicketPrize()+"\t"+"Event_type: "+e.getEventType());
				}
				System.out.println("Enter event ID to book ticket");
				int eventId = sc.nextInt();
				System.out.println("Enter number of Tickets to book");
				int numberOfTickets= sc.nextInt();
				
				// check if availableseats>numberOfTickets
				// fetch event based on id and do comparision 
				boolean isAvailable = eventService.isTicketAvailable(list, eventId , numberOfTickets);
				if(isAvailable == false) {
					System.out.println("Ticket not available");
					break;
				}
				
				//step 3:insert record in booking table 
				eventService.insertRecordInBooking(list , customerId, eventId ,numberOfTickets );
				
				//step 4:deduct available seats from events.
				eventService.updateAvailableSeats(list , eventId , numberOfTickets);
				System.out.println("Booking confirmed");
			
			} 
			
			catch (SQLException   | InvalidIdException e) {
				System.out.println(e.getMessage());
				break;
			}
			
			System.out.println("Ticket Booked Successfully");
			break;
		default:
			System.out.println("Invalid Input ");

		
		}//switch ends
		}//while ends
		sc.close();
	}//main ends
}//class ends
		
