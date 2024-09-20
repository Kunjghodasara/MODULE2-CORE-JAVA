package com.assignment.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_7 {
		
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		try (Scanner sc = new Scanner(System.in)) {
			names.add("kunj");
			names.add("raj");
			names.add("yash");
			names.add("dev");
			names.add("jay");
			names.add("Ravi");
			System.out.println(names);
			System.out.print("Enter an element for searching : ");
			String search = sc.nextLine();
			
			System.out.println(search + " is present at position " + names.indexOf(search));
		}
		
	}
}
