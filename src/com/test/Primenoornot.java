package com.test;

import java.util.Scanner;

public class Primenoornot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}

	}

}
