package com.demo;

import java.util.Scanner;

public class SwitchDemo {
	
		public static void main(String[] args) 
		{ 
			int d; 
			
			String weekDay; 
	    Scanner in = new Scanner(System.in);
	    System.out.println("Please, enter a number from 1 to 7: ");
	    d = in.nextInt(); 
			switch (d) { 
			case 1: 
				weekDay = "Monday"; 
				break; 
			case 2: 
				weekDay = "Tuesday"; 
				break; 
			case 3: 
				weekDay = "Wednesday"; 
				break; 
			case 4: 
				weekDay = "Thursday"; 
				break; 
			case 5: 
				weekDay = "Friday"; 
				break; 
			case 6: 
				weekDay = "Saturday"; 
				break; 
			case 7: 
				weekDay = "Sunday"; 
				break; 
			default: 
				weekDay = "Invalid day"; 
				break; 
			} 
			System.out.println(weekDay); 
		} 
	}

