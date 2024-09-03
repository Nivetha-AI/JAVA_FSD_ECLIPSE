package com.model;

public class Dog extends Pet{
// dog attributes are inherited
	
	private String dogBreed ;

	public Dog(String name, int age, String breed, String dogBreed) {
		super(name, age, breed);
		this.dogBreed = dogBreed;
	}

	public Dog() {
		
	}

	public Dog(String name, int age, String breed) {
		super(name, age, breed);
	}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}
	
	
}
