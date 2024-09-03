package com.controller;

import java.util.Scanner;

import com.exception.InvalidPetAgeException;
import com.exception.NullReferenceException;
import com.model.Pet;
import com.service.PetShelterService;

public class PetController {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	PetShelterService petShelterService = new PetShelterService ();
	while (true) {
		System.out.println("*********** Pet ***********");
		System.out.println("Press 1. To  add  pets");
		System.out.println("Press 2. display all pets");
		System.out.println("Press 0 for exit");
		System.out.println("************************************");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("Exiting .. Thank you !!");
			break;
		}//if ends
	
		switch(input) {
		case 1:
	System.out.println("Enter pet name ");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.println("ENter the Age");
	int age = sc.nextInt();
	System.out.println("ENter breed name");
	sc.nextLine();
	String breed=sc.nextLine();
	
	
	try {
		petShelterService.validateAge(age);
		Pet pet = new Pet(name , age , breed);
		petShelterService.addPet(pet);
		System.out.println("pet added to the list");
		
	} catch (InvalidPetAgeException e) {
		System.out.println(e.getMessage());
	}
	break;
		case 2:
	
	try {
		petShelterService.listAvailablePets();
	} catch (NullReferenceException e1) {
		System.out.println(e1.getMessage());
	}
	break;
		}
	
	
 
 }sc.close();
}
}
