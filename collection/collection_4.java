package com.assignment.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_4 {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		try (Scanner sc = new Scanner(System.in)) {
			names.add("kunj");
			names.add("raj");
			names.add("yash");
			names.add("dev");
			names.add("jay");
			names.add("Ravi");
			
			System.out.print("Enter a index between 0-" + (names.size()-1) + " : ");
			int index = sc.nextInt();
			
			System.out.println("Element at index " + index + " is " + names.get(index));
		}
	}
}
