package week2;

import java.util.Scanner;

public class AreaCircle {
	
	public static void main(String[] args) {
		
		double r; // r is the raduis of the circle
		
		double pi = Math.PI; 
		
		double a; // a is the area of the circle
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please, enter the circle radius: ");
		
		r = in.nextDouble();
		
		a = pi * r * r;
		
		System.out.printf("Here is the area: " + "%.2f", a);
		
	}

}
