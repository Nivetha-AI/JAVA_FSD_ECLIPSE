package com.controller;

public class StringBuilderApp {
 public static void main(String[] args) {
	// compare between Strings :go for a string class and use equals
	 // however , if you want to manipulate String values , go for stringbuilder
	 
	 StringBuilder sb1 = new StringBuilder("java");//100x:java
	 StringBuilder sb2 = new StringBuilder("java");//200x:java
	 System.out.println(sb1.equals(sb2)); // == equal method of Stringbuilder compares location
	 
	 String s= "harry potter 101/2 kingston lane thames london TW31SE";
	 StringBuilder sb = new StringBuilder(s);// convert String to StringBuilder
	 
	 StringBuilder sb4= new StringBuilder(sb.substring(0,12));//100x:harry potter
	 sb4.append(":" +s.split(" ")[7]);// 100x:harry potter:TW31SE
	 System.out.println(sb4);
	 
	 // StrinngBuilder does not create a new location during . hence  it must be used to make changes to string variables
	 
	 StringBuffer sbuff = new StringBuffer(s);
	 //use stringBuffer , if there is large String to hold instead of string class

	 
	 
}
}
