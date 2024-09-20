package com.assignment.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collection_10 {
	
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
		System.out.println("List before shuffling : " + names);
		Collections.shuffle(names);
		System.out.println("List after shuffling : " + names);
	}

}
