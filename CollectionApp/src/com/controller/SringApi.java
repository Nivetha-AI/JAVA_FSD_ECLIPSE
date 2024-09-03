package com.controller;

public class SringApi {
     public static void main(String[] args) {
		// ways of creating a string variable
    	 String str="harry potter";//string literal
    	 String str1="ronald weasley";//string literal
    	 
    	 String s1 = new String("harry potter");
    	 String s2= new String("ronald weasley");
//    	 
//    	 References are saved in a stack
//    	 literal are saved in string pool memory
//    	 objects are saved in stack and heap
    	 
    	 
    	 // 1.pool  does not take duplicates 
    	 String str2="harry potter";
    	 String s3= new String("harry potter");
    	 
    	 //String comparison
    	 System.out.println(str == str1);// == operator compares locations- false
    	 System.out.println(str == str2); // true
    	 
    	 System.out.println(str == s1);// false
    	 
    	 // programmer Tip: use equal method to compare Strings :As equals compares values
    	 System.out.println(str.equals(s1));// true
    	 System.out.println(str.equalsIgnoreCase(s1));// true
	}
}
