package com.assignment.collection;

import java.util.HashMap;
import java.util.Scanner;

public class collection_15 {
			
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		try (Scanner sc = new Scanner(System.in)) {
		}
		hm.put(101, "kunj");
		hm.put(102, "raj");
		hm.put(103, "yash");
		hm.put(104, "dev");
		hm.put(105, "bhavesh");
		
		System.out.println("The size of hashmap is " + hm.size());
	}
		
}
