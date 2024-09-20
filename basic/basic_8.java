package com.assignment.basic;

import java.util.Scanner;

public class basic_8 {
	
	public static void main(String[] args) {
		int n, temp, count = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the number : ");
			n = scanner.nextInt();
		}
		temp = n;
		 
		while(temp != 0) {
			temp = temp/10;
			count++;
		}
		 System.out.println("There are " + count + " digits in " + n);
	}
}
