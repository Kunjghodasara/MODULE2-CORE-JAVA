package com.assignment.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_5 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		try (Scanner sc = new Scanner(System.in)) {
			names.add("kunj");
			names.add("raj");
			names.add("yash");
			names.add("dev");
			names.add("jay");
			names.add("Ravi");
			
			System.out.println("Names before updation : " + names);
			System.out.print("Enter a index between 0-" + (names.size()-1) + " : ");
			int index = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter name for updation : ");
			String name = sc.nextLine();
			names.set(index, name);
		}
		System.out.println("Names after updation : " + names);
		
	}
}
