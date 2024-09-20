package com.assignment.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_6 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		try (Scanner sc = new Scanner(System.in)) {
		}
		names.add("kunj");
		names.add("raj");
		names.add("yash");
		names.add("dev");
		names.add("jay");
		names.add("Ravi");
		
		System.out.println("Names before removing third element : " + names);
		names.remove(2);
		System.out.println("Names after removing the third element : " + names);
		
	}
}
