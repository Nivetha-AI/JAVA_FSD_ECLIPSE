package com.service;

import java.util.HashSet;
import java.util.Set;

class Demo
{
  public static void main(String[] args) {
 
Student s1= new Student(2,"dsa",2330);
Student s2= new Student(2,"dsa",2330);

Set <Student>set = new HashSet<>();
set .add(s1);
set.add(s2);
System.out.println(set);

//if(s1.equals(s2)) {
//	System.out.println("same");
//}
//else {
//	System.out.println("not same");
//}
}
}