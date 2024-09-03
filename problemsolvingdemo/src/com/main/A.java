package com.main;
import java.util.Arrays;
//Divide and conquer
//algo: merge sort
public class A {//service
   public Integer[] sortArry(Integer[] arry){
	   Arrays.sort(arry);//this will sort the array
	   return arry;
   }

public int binarySearchOp(Integer[] sortedArry, int e) {
	// TODO Auto-generated method stub
	return Arrays.binarySearch(sortedArry,e);
}
   }
