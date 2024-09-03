package com.controller;

public class StringMethod {
 public static void main(String[] args) {
	// + concat operator 
	 String str ="harry";
	 str= str + " "+"potter";
	 System.out.println(str);// harry potter
	 
	 String s1 = "hello" + 1 +2;
	 System.out.println(s1);// hello12
	 
	 String s2 = 1+2 + "hello";
	 System.out.println(s2);//3hello
	 
	 String s3 = 4+5+"ok"+ 6+7;
	 System.out.println(s3);//9ok67
	 
	 //concat method 
	 System.out.println("harry".concat(" potter"));// harry potter
	 String fname = "harry";
	 String lname="potter";
	 fname.concat(lname);// worthless since we did not assign variable
	 System.out.println(fname);// harry
	 
	 //  length 
	 System.out.println(fname.length());// 5
//	 System.out.println(fname.length);// -- CF
	 
	 // substring
	 String name ="harry potter";
	 String firstName = name.substring(0,5);//0-4
	 System.out.println(firstName);// harry
	 String lastName = name.substring(6); // 6--name.length
	 System.out.println(lastName);// potter
	 
	 // split
	 String address="101/2, Cresent Cross Bldg,Kingston lane, mumbai, 430092";
	 String[] addr = address.split(",");
	 System.out.println("house no:"+ addr[0].trim());
	 System.out.println("Bldg name:"+ addr[1].trim());
	 System.out.println("Lane:"+ addr[2].trim());
	 System.out.println("City:"+ addr[3].trim());
	 System.out.println("Pincode:"+ addr[4].trim());
	 
	 // trim //
	 String ss ="     hello java    ";
	 System.out.println(ss.trim().length());//10
	 
	 
}
}

// note :Strings are immutable . once they are saved in memory , it won't
//change the value
//if you want the string to have another value , jvm will create a new location
//to hold value
