package com.assignment.basic;

import java.util.Scanner;

public class basic_4 {
	
	public static void main(String[] args) {
		int n;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter n : ");
			n = scanner.nextInt();
		}
		int i = 1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}

}
