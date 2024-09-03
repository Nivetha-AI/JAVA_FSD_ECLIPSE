package com.service;

import java.util.Arrays;
import java.util.List;

public class NameService {

	public double processInfo(String fname, String lname, String city) {
		// fname should not be blank or null
		if (fname.equals("null") || fname.equals(" ")) {
			throw new RuntimeException("fname is invalid");
		}
		//lname should not be blank or null
		if (lname.equals("null") || lname.equals(" ")) {
			throw new RuntimeException("lname is invalid");
		}
		//city should not be blank or null
		if (city.equals("null") || city.equals(" ")) {
			throw new RuntimeException("city is invalid");
		}
	
		//city should be in specified list ["mumbai", "chennai"}
		String [] cities= {"mumbai", "chennai"};
		List <String> cityList = Arrays.asList(cities);
	    if (!(cityList.contains(city))) {
	    	throw new RuntimeException("city is not present in prescribed list ");
	    }
		return 9;
	}

}
