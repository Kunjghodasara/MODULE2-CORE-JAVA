package com.assignment.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_9 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>();
		try (Scanner sc = new Scanner(System.in)) {
		}
		names.add("kunj");
		names.add("raj");
		names.add("yash");
		names.add("dev");
		names.add("jay");
		names.add("Ravi");
		System.out.println("names : " + names);
		names2.addAll(names);
		System.out.println("names2 : " + names2);
	}
	
}
