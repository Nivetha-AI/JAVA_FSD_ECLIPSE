package com.service;

import java.util.ArrayList;
import java.util.List;

import com.exception.InvalidPetAgeException;
import com.exception.NullReferenceException;
import com.model.Pet;

public class PetShelterService {
   List<Pet> list= new ArrayList<>();
   
   public void addPet(Pet pet) {
	   list.add(pet);
   }
   
   public void removePet(Pet pet) {
	   list.remove(pet);
   }
   public void listAvailablePets() throws NullReferenceException {
	   
	  for(Pet e:list) {
		  if(e.getName()== null || e.getName().equals("null")) {
			   throw new NullReferenceException("Name not be null");
		   }
		  System.out.println(e);
	  }
   }

public void validateAge(int age) throws InvalidPetAgeException {
	if(age<=0) {
		throw new InvalidPetAgeException("Age must be >0 ");
	}
	
}
}
