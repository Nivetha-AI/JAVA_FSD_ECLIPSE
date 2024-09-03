package com.controller;

public class Finalstaticdemo {

}

// final methods

class X {
	final void m1() {
		System.out.println("m1 of x");
	}

}
class X1 extends X{//when we declare final method we can't use it further
	void m1(){// it is not advisable
		System.out.println("m1 of x1");
		}
}
// final class
final class A{
	void m1(){
		System.out.println("m1 of x");
	}
}

class b extends A{// we cannot extend class because in class it is declared as final 
	//so we can't use the class further . it shouldn't
	
}

// final variable 
class A1{
 	final int x= 8; // instance variable
	// we should give final keyword in instance variable because we are using it further
	void m1(int x) {
		this.x=x ; // CF this.x is final , cannot be reassigned
	}
}

class a2{
	String fname ="nive";
	String lname = "T ";
	public String concat(final String fname ,final String lname) {// we can use it in arguments as it is local variable
		String name = fname + " " + lname ;
		return name;
	}
}