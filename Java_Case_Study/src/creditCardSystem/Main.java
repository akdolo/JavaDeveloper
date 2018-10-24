package creditCardSystem;

/*
 * 1) To display the transactions made by customers living in a given zipcode for 
 * a given month and year. Order by day in descending order.
 * 2) To display the number and total values of transactions for a given type.
 * 3) To display the number and total values of transactions for branches in a 
 * given state
 * 1) To check the existing account details of a customer.
 * 2) To modify the existing account details of a customer
 * 3) To generate monthly bill for a credit card number for a given month and year.
 * 4) To display the transactions made by a customer between two dates. Order by 
 * year, month, and day in descending order.
 */

import java.sql.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {
		
		System.out.println("Welcome to AKD Bank");
		System.out.println("With AKD Bank, you are in good hand");
		System.out.println("Please, how can we help?");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean next = true;
		
		short choice = 0;
		
		do {
			try {
					System.out.println();
					System.out.println("Please enter a number from the menu below:");
					System.out.println("Please enter 1 to display the transactions made by customers");
					System.out.println("Please enter 2 to display the number and total values of transactions for a given type");
					System.out.println("Please enter 3 to display the number and total values of transactions for branches in a given state");
					System.out.println("Please enter 4 to display the existing account details of a customer");
					System.out.println("Please enter 5 to modify the existing account details of a customer");
					System.out.println("Please enter 6 to generate the monthly bill for a credit card number for a given month and year");
					System.out.println("Please enter 7 to display the transactions made by a customer between two dates.");
					choice = scanner.nextShort();
					
					switch(choice) {
					case 1: {TransactionRunner trans = new TransactionRunner();
							next = trans.getTransZipMoYear();
							
							continue;
						}
					case 2: {TransactionRunner trans = new TransactionRunner();
							next = trans.getTransType();
							
							continue;
						}
					case 3: {TransactionRunner trans = new TransactionRunner();
							next = trans.getTransState();
							
							continue;
						}
					case 4: {CustomerRunner cust = new CustomerRunner();
							next = cust.getCustDetails();
							
							continue;
						}
					case 5: {CustomerRunner cust = new CustomerRunner();
							next = cust.updateCustDetails();
							
							continue;
							}
					case 6: {TransactionRunner trans = new TransactionRunner();
							next = trans.getMonthlyBill();
							
							continue;
					}
					case 7: {
							TransactionRunner trans = new TransactionRunner();
							next = trans.getTransBetweenDates();
							
							continue;
						}
					default: {
							System.out.println("Not a valid choice. Please try again.");
							System.out.println();
							scanner.nextLine();
							
							continue;
					}
				}
			}
			catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid number. Please try again.");
					System.out.println();
					scanner.nextLine();
					
					continue;
				}
			catch(Exception e) {
				
				System.out.println("Please try again.");
				scanner.nextLine();
				
				continue;
			}
			finally {
			}
		}
		while ( next == true);

		scanner.close();
	}
}
