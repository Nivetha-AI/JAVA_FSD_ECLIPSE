package com.util;

public class Stringutil {
  public static String concatName(String fname , String lname) {
	  String name = fname + " "+ lname;
	  return name;
  }
}
// if we don't give static means we have create object for each service'
//now we don't have create same object when we give static'
//Stringutil stringutil = new Stringutil();
// we have to give this when we don't use static in stringutil