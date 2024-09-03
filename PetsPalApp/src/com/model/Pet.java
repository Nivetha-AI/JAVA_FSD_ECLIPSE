package com.model;

public class Pet {
   private String name;
   private int age;
   private String Breed;
public Pet(String name, int age, String breed) {
	this.name = name;
	this.age = age;
	Breed = breed;
}
public Pet() {

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getBreed() {
	return Breed;
}
public void setBreed(String breed) {
	Breed = breed;
}
@Override
public String toString() {
	return "Pet [name=" + name + ", age=" + age + ", Breed=" + Breed + "]";
}
   
   
}
