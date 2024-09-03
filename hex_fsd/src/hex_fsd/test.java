package hex_fsd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class test {
	public static void main(String[] args) {
		int a[] = { 4, 6, 7, 88, 99, 3, 45, 23, 67, 89, 12, 34, 56 };
		int passmark = 40;
		List<Integer> p = new ArrayList<>();
		List<Integer> f = new ArrayList<>();

		for (int i : a) {
			if (i >= passmark) {
				p.add(i);
			} else {
				f.add(i);
			}
		}
		System.out.println("pass" + p);
		System.out.println("fail" + f);

		int a1[] = { 4, 6, 7, 88, 99, 3, 45, 23, 6, 7, 88, 99, 3, 45, 23, 6, 7, 88, 99, 3, 45, 23, 67, 89, 12, 34, 56 };
		Set<Integer> s = new HashSet<>();
		for (int i : a1) {
			s.add(i);
		}
		System.out.println(s);

		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Nive");
		map.put(102, "pooja");
		map.put(102, "ajay");

		map.put(103, "komal");

		map.put(102, "Aman");

		if (map.containsKey(101)) {
			System.out.println(map.get(101));
		} else {
			System.out.println("not found");
		}

		Map<Integer, String> users = new HashMap<>();

		users.put(101, "Asha");
		users.put(102, "pooja");
		users.put(102, "ajay");

		users.put(103, "komal");

		users.put(102, "Aman");

		System.out.println(users);

		int id = 101;
		String pass = "Asha";

		if (users.containsKey(id) && users.containsValue(pass)) {

			System.out.println("Login");

		} else {
			System.out.println("Logout");
		}

		Stack<Integer> sk = new Stack<>();
		sk.push(1);
		sk.push(2);
		sk.push(3);

		sk.push(4);
		sk.push(5);

		while (sk.size() > 0) {
			System.out.println(sk.pop());
		}

		String books[] = { "dsa", "c++", "os", "react", "js" };

		Stack<String> b = new Stack<>();
		for (String i : books) {
			b.push(i);
		}
		while (b.size() > 0) {
			System.out.println(b.pop());
		}
		System.out.println(b);
		System.out.println("-------");
		Scanner sc = new Scanner(System.in);

//		Map<String,Double> items= new HashMap<>();
//		items.put("item1", 200.9);
//		items.put("item2", 300.9);
//	 
//		items.put("item3", 500.9);
//		items.put("item4", 700.9);
//		items.put("item5", 900.9);
//		
//		// take item qty  from the user
//		System.out.println("enter item");
//		String it=  sc.nextLine();
//		
//		System.out.println("enter qty");
//		int qty= sc.nextInt();
//		
//		if (items.containsKey(it))  {
//		    double price =items.get(it);
//		    double bill=price* qty;
//		    System.out.println(bill);
//		    
//		}
//		else {
//			System.out.println("not found");
//		}

		// find out the k th min number 3

		// add all q
		// poll k-1
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		int a2[] = { 4, 6, 17, 8, 9, 3, 4, 6, 7, 2, 23, 14, 5 };

		// sort asc

		for (int i = 0; i < a2.length; i++) {
			PQ.offer(a2[i]);
		}
		System.out.println(PQ.poll());
		System.out.println("Enter number");
		int k = sc.nextInt();
		for (int i = 0; i < k - 1; i++) {
			PQ.poll();
		}
		System.out.println("kth min  number " + PQ.poll());

//	
//	while(PQ.size()>0)
//	      {
//	    	  System.out.println(PQ.poll());
//	      }
//	    

		PriorityQueue<Integer> P = new PriorityQueue<>(Collections.reverseOrder());// reverse order

		for (int i : a2) {
			P.add(i);

		}
		System.out.println("enter num");
		int m = sc.nextInt();
		for (int i = 0; i < m - 1; i++) {
			P.poll();
		}

		System.out.println("kth maximum number " + P.poll());

	}

}