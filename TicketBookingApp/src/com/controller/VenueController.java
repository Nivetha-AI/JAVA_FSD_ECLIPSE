package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.Venue;
import com.service.VenueService;

public class VenueController {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VenueService venueService= new VenueService();
		while (true) {
		System.out.println("*********** vENUE OPS ***********");
		System.out.println("Press 1. for all venue details");
		System.out.println("Press 2.for specific venue details");
		System.out.println("Press 0 for exit");
		System.out.println("************************************");

		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("Exiting .. Thank you !!");
			break;
		}//if ends
		
		switch(input) {
		case 1:
			System.out.println("***ALL VENUE DETAILS***");
			
			try {
				List<Venue> list = venueService.getAllVenues();
				for(Venue v:list) {
					System.out.println(v);
				}
				
			} catch (SQLException e) {
				System.out.println();
	
			}
			break;
		case 2:
			System.out.println("***SINGLE VENUE DETAILS");
			System.out.println("Enter venue Id : ");
			int id = sc.nextInt();
			
			try {
				Venue venue = venueService.getVenueById(id);
				System.out.println(venue);
			} catch (SQLException e) {// if query goes wrong
				System.out.println(e.getMessage());
			}
			catch(NullPointerException e) {// if id is invalid
				System.out.println(e.getMessage());
			}
			
			break;
		default:
			System.out.println("Invalid Input ");
		}//switch ends
				
		}//while ends
		sc.close();
	}//main ends
}//class ends ctrl+shift+f - formatting
