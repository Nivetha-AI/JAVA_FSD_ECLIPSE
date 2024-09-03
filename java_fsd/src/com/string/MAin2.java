package com.string;

public class MAin2 {
  
public static void main(String[] args) {
	String str="Welcome in java or dbms";
	
	// show first and last letter of each word
	System.out.println(str.charAt(0));
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			System.out.println(str.charAt(i-1) +  "  " + str.charAt(i+1) );
			
		}
	}
	System.out.println(str.charAt(str.length()-1) );
	
	// 
}
}
