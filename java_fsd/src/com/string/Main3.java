package com.string;

public class Main3 {
public static void main(String[] args) {
String str="Welcome in java or dbms";
	
	// count no of letters in each word
	
	int c=0;
	for(int i=0;i<str.length();i++) {
		c++;
		if(str.charAt(i)==' ') {
			 System.out.println(c-1);
			 c=0;
		}
	}
	System.out.println(c);
	
	
}
}
