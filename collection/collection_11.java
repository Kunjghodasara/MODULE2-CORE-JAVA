package com.assignment.collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class collection_11 {
			
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		try (Scanner sc = new Scanner(System.in)) {
			hs.add("kunj");
			hs.add("jay");
			hs.add("yash");
			hs.add("dev");
			hs.add("raj");
			hs.add("bhavesh");
			System.out.println(hs);
			System.out.println("Enter the element to be entered last : ");
			String elem = sc.nextLine();
			hs.add(elem);
		}
		System.out.println(hs);
		
	}
}
