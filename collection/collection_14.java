package com.assignment.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class collection_14 {
		
			
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		try (Scanner sc = new Scanner(System.in)) {
			hm.put(101, "kunj");
			hm.put(102, "raj");
			hm.put(103, "yash");
			hm.put(104, "dev");
			hm.put(105, "bhavesh");
			
			System.out.println(hm);
			System.out.println("Enter key : ");
			int key = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter value : ");
			String value = sc.nextLine();
			hm.put(key, value);
		}
		Set<?> set = hm.entrySet();
		Iterator<?> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
