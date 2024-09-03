package com.main;

public class Main {//JVM vl run this class
   public static void main(String[] args) {
	   //reach out to class A
	   A aobj = new A();
	   Integer[] arry = new Integer[] {3,4,1,6,9,2};
	   Integer[] sortedArry = aobj.sortArry(arry);
	   for ( int e :sortedArry) {
		   System.out.print(e+ " ");
	   }
	  System.out.print("\n Binary search -Divide and conquer\n"); 
	  int result =aobj.binarySearchOp(sortedArry,4);
	  if(result>=0)
		  System.out.println("Element is present");
	  else
		  System.out.println("Element is not present");
	   
   }
}
