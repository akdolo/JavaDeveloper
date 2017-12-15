package www.somereviews.com;

import java.util.Scanner;

public class IfElseIfDemo {
	public static void main(String[] args) {
		//int grade = 70;
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter your grade: ");
		double grade = input.nextDouble();
		//System.out.println("Please, enter your grade: ");
	
		if(grade < 60){
			System.out.println("Your final grade is F");
		}
		else if(grade>= 60 && grade < 70){
			System.out.println("Your final grade id D");
		}
		else if(grade>= 70 && grade < 80){
			System.out.println("You final grade is C");
			
		}
		else if(grade >= 80 && grade< 90){ 
			System.out.println("Your final grade is B");
		}
		else if(grade >= 90 && grade <=100){
			System.out.println("Your final grade is A");
		}
		else
			System.out.println("Invalid entry");
	}

}

