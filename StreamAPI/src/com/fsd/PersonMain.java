package com.fsd;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> person = new ArrayList<>();
		Person p1 = new Person("Nivetha", 21, "Chennai");
		person.add(p1);
		Person p2 = new Person("Ramya", 31, "Coimbatore");
		person.add(p2);
		Person p3 = new Person("Pooja", 11, "Pune");
		person.add(p3);
		Person p4 = new Person("Sakthi", 22, "Bangalore");
		person.add(p4);
		Person p5 = new Person("Preetha", 15, "New york");
		person.add(p5);
		Person p6 = new Person("Priya", 29, "New york");
		person.add(p6);
		// Task 1: Print the names of all persons in the list.
		person.stream().forEach((t) -> System.out.println(t.toString()));
		System.out.println("_______");
		// Task 2: Print the names of all persons who are older than 25 years.Mapping
		// and Filtering

		person.stream().filter((t) -> t.getAge() > 25).forEach((temp) -> System.out.println(temp.toString()));
		System.out.println("_______");
		// Task 3: Create a new list of names of all persons who live in a specific city
		// (e.g., "New York").
		List l1 = person.stream().filter((t) -> t.getCity().equalsIgnoreCase("New York")).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println("_______");
		// Task 4: Create a new list of ages of all persons, but only include those who
		// are above 30 years old.
		List l2 = person.stream().filter((t) -> t.getAge() > 30).collect(Collectors.toList());

		System.out.println(l2);
		System.out.println("_______");

		// ask 7: Compute the average age of all persons in the list.
		double age = person.stream().mapToInt((t) -> (t.getAge())).average().orElse(0);
		System.out.println(age);
		System.out.println("_______");
//	Task 8: Find the maximum and minimum age among the persons.
		OptionalInt max = person.stream().mapToInt((t) -> t.getAge()).max();
		System.out.println(max.getAsInt());
		System.out.println("_______");
		OptionalInt min = person.stream().mapToInt((t) -> t.getAge()).min();
		System.out.println(min.getAsInt());

//	Task 9: Group persons by their city and print the groups.

//	Advanced Operations
//
//	Task 10: Create a list of all unique cities where the persons live.
		List<String> uniqueCity = person.stream().map((t) -> t.getCity()).distinct().collect(Collectors.toList());
		System.out.println(uniqueCity);
		System.out.println("_______");
//	Task 11: Concatenate the names of all persons into a single string separated by commas.
		String concatenate = person.stream().map((t) -> t.getName()).collect(Collectors.joining(", "));
		System.out.println(concatenate);
		



	}
	

}
