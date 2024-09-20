package com.assignment.collection;

import java.util.HashSet;
import java.util.Scanner;

public class collection_13 {
			
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		try (Scanner sc = new Scanner(System.in)) {
		}
		hs.add("kunj");
		hs.add("jay");
		hs.add("yash");
		hs.add("dev");
		hs.add("raj");
		hs.add("bhavesh");
		
		System.out.println(hs);
		System.out.println("The size of the set is " + hs.size());
	}
}
