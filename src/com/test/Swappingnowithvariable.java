package com.test;

import java.util.Scanner;

public class Swappingnowithvariable {

	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("no are:");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		
		System.out.println(a);
		System.out.println(b);

	}

}
