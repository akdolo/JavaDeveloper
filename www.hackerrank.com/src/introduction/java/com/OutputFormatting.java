package introduction.java.com;

import java.util.Scanner;
/*
 Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer. 
Each String will have a maximum of  alphabetic characters, and each 
integer will be in the inclusive range from to .

Output Format

In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly  characters. 
The second column contains the integer, expressed in exactly  digits; if the original
input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
Explanation

Each String is left-justified with trailing whitespace through the first 15 characters. 
The leading digit of the integer is the 16th character, and each integer that was less than 3  
digits now has leading zeroes. 
 */

public class OutputFormatting {

	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
         for(int i=0;i<3;i++)
         {
             String s1=sc.next();
             int x=sc.nextInt();
             String s2=sc.next();
             int x1=sc.nextInt();
             String s3=sc.next();
             int x2=sc.nextInt();
             
         System.out.println("================================");
         	// %-14s  fifteen characters left-justified o to 14
         	// %03d padded with leading zero
             System.out.printf("%-14s %03d", s1, x);
             System.out.println();
             System.out.printf("%-14s %03d", s2, x1);
             System.out.println();
             System.out.printf("%-14s %03d", s3, x2);
             System.out.println();
             //Complete this line
   
         System.out.println("================================");

 }
}
}
