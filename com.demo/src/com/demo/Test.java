package com.demo;

public class Test {

	public static void main(String[] args) {
		
		String myString = " This is not a hello world!";
		
		//This is call by value
		
		System.out.println(myString.charAt(9));
		
		System.out.println(myString.charAt(11));
		
		char myChar = myString.charAt(10);
		
		System.out.println(myChar);
		
		int num = 4;
		
		//reference + value
		
		int sum = num + 2;
		
		short num2 = 6;
		
		short cool = (short)(num + 4);
		
		int x = 2;
		
		int y = 3;
		
		System.out.println(myString.contains("hello"));
		
		//Single ampersand checks all conditions but double ampersand
		//will immediately stop checking if it finds false in condition
		
		if (3 < 2 & 5 > 7) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if (4 > 3 | 4 < 3) {
			System.out.println();
		}
	}
}
