package com.demo;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		//int x = 0;
		//int y = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please, enter a value for X: ");
		int x = in.nextInt();
		System.out.println("Please, enter a value for y: ");
		int y = in.nextInt();
		
		System.out.println("The sum of x and y = " + ( x+y));
	}

}
