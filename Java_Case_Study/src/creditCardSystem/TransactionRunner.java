package creditCardSystem;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import dao.DAO;
import pojos.Transaction;

public class TransactionRunner extends DAO {
	
	public boolean getTransZipMoYear () {
		boolean next = false;
		
		Scanner scanner = new Scanner(System.in);
		int intZip = 0;
		String strZip = null;
		short year = 0;
		short month = 0;
		boolean validChoice = false;
		boolean foundConnection = DAO.connect();

		if (foundConnection) {
		
			do {
				try {
					System.out.println("Please, enter the 5 digit zipcode for the customers you want to query");
					intZip = scanner.nextInt();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid zip code. Please try again");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
				}
				validChoice = true;
				strZip = Integer.toString(intZip);
			}
			while (validChoice != true);
		
			validChoice = false;
			do {
				try {
					
					System.out.println("Please enter the year using 4 digits for the transactions you would like to query.");
					year = scanner.nextShort();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid year. Please try again.");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.getStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
				}
				validChoice = true;
				}
				while (validChoice != true);
		
			validChoice = false;
			do {
				try {
					System.out.println("Please enter the month using 2 digits for the transactions you would like to query.");
					month = scanner.nextShort();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid month. Please try again.");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
				}
				validChoice = true;
			}
			while (validChoice != true);
		
			try {
				DAO dao = new DAO();
				List <Transaction> list = dao.getTransZip(strZip, month, year);
				System.out.println("Here is the list of transactions for customers in the " + strZip + " zip code for " + month +"/" + year);
				System.out.println("");
				for (Transaction trans: list) {
					System.out.println("Transaction ID: "+ trans.getTransID());
					System.out.println("Day of month: "+trans.getDay());
					System.out.println("Month: "+ trans.getMonth());
					System.out.println("Year: "+ trans.getYear());
					System.out.println("Credit Card Number: "+trans.getCc());
					System.out.println("SSN: "+trans.getCustSSN());
					System.out.println("Branch Code: "+trans.getBranchCode());
					System.out.println("Transaction Type: "+trans.getTransType());
					System.out.println("Transaction Value: "+trans.getTransValue());
					System.out.println("");
				}
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
				validChoice = false;
			}
		
		} else {
			System.out.println("Connection not found");
		}
		validChoice = false;
		do {
			try {
				System.out.println("Please, enter 9 to go back to the main menu, or any other number to view another customer, or 0 to exit");
				short nextChoice = scanner.nextShort();
				if (nextChoice == 9) {
					next = true;
					scanner.nextLine();
				}
					else {
						scanner.close();
				}
			}
			catch(InputMismatchException | NumberFormatException numberInputException){
				
				System.out.println(numberInputException);
				System.out.println("Not a valid choice. Please try again.");
				System.out.println();
				scanner.nextLine();
				validChoice = false;
				continue;
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Please try again.");
				scanner.nextLine();
				validChoice = false;
				continue;
			}
			finally {
			}
			validChoice = true;
		}
		while (validChoice != true);
		
		return next;	
	}
	public boolean getMonthlyBill () {
		boolean next = false;
		
		Scanner scanner = new Scanner(System.in);
		
		String ccNo = null;
		short year = 0;
		short month = 0;
		boolean validChoice = false;
		boolean foundConnection = DAO.connect();

		if (foundConnection) {
		
			do {
				try {
					System.out.println("Please enter the credit card number without any spaces or punctuation:");
					ccNo = scanner.nextLine();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Please try again");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
				}
				validChoice = true;
			}
			while (validChoice != true);
		
			validChoice = false;
			do {
				try {
					
					System.out.println("Please enter the year using 4 digits:");
					year = scanner.nextShort();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid year. Please try again.");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.getStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
				}
				validChoice = true;
				}
				while (validChoice != true);
		
			validChoice = false;
			do {
				try {
					System.out.println("Please enter the month using 2 digits:");
					month = scanner.nextShort();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid month. Please try again.");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
				}
				validChoice = true;
			}
			while (validChoice != true);
		
			try {
				DAO dao = new DAO();
				Transaction trans = new Transaction();
				trans = dao.getMonthlyBill(ccNo, month, year);
				System.out.println("The monthly bill for credit card number " + ccNo + " for " + month +"/" + year + " is: $" + trans.getDollarValue());

			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
				validChoice = false;
			}
		
		} else {
			System.out.println("Connection not found");
		}
		
		validChoice = false;
		do {
			try {
				System.out.println("Please, enter 9 to go back to the main menu, or any other number to view another customer, or 0 to exit");
				short nextChoice = scanner.nextShort();
				if (nextChoice == 9) {
					next = true;
					scanner.nextLine();
				}
					else {
						scanner.close();
				}
			}
			catch(InputMismatchException | NumberFormatException numberInputException){
				
				System.out.println(numberInputException);
				System.out.println("Not a valid choice. Please try again.");
				System.out.println();
				scanner.nextLine();
				validChoice = false;
				continue;
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Please try again.");
				scanner.nextLine();
				validChoice = false;
				continue;
			}
			finally {
			}
			validChoice = true;
		}
		while (validChoice != true);
		
		return next;	
	}
	
	public boolean getTransType () {
		boolean next = false;
		boolean another = false;
		
		Scanner scanner = new Scanner(System.in);
		short choice = 0;


		boolean validChoice = false;
		boolean foundConnection = DAO.connect();

		if (foundConnection) {
		
			do {
				try {
					System.out.println("Please enter a number for the type of transaction you would like to query below:");
					System.out.println("Please enter 1 to display the number and total value of transactions for Bills");
					System.out.println("Please enter 2 to display the number and total value of transactions for Education");
					System.out.println("Please enter 3 to display the number and total value of transactions for Entertainment");
					System.out.println("Please enter 4 to display the number and total value of transactions for Gas");
					System.out.println("Please enter 5 to display the number and total value of transactions for Grocery");
					System.out.println("Please enter 6 to display the number and total value of transactions for Healthcare");
					System.out.println("Please enter 7 to display the number and total value of transactions for Test");
					
					choice = scanner.nextShort();
					if((choice >= 1) && (choice <= 7)) {
						validChoice = true;
						try {
							DAO dao = new DAO();
							Transaction trans = new Transaction();
							trans = dao.getTransType(choice);
							System.out.println("There are " + trans.getTransID() + " "+ trans.getTransType() + " transactions with a total value of $" + trans.getDollarValue());
							System.out.println("");
							System.out.println("Please, enter 9 to go back to the main menu, or any other number to view another customer, or 0 to exit");
							validChoice = false;
							short nextChoice = scanner.nextShort();
							if (nextChoice == 9) {
								another = false;
								next = true;
								dao.close();
								scanner.nextLine();
								break;
							}
							else if (nextChoice == 0) {
									dao.close();
									scanner.close();
									break;
							}
							else {
								another = true;
								validChoice = false;
								scanner.nextLine();
								continue;
							}

						} catch (ClassNotFoundException | SQLException e) {
							
							e.printStackTrace();
							another = true;
							validChoice = false;
							System.out.println("Not a valid choice. Please try again");
							System.out.println();
							scanner.nextLine();
							continue;
						}
					}
					else {
						another = true;
						validChoice = false;
						System.out.println("Not a valid choice. Please try again");
						System.out.println();
						scanner.nextLine();
						continue;
					}	
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					another = true;
					validChoice = false;
					System.out.println(numberInputException);
					System.out.println("Not a valid choice. Please try again");
					System.out.println();
					scanner.nextLine();
					continue;
				}
				catch(Exception e) {
					another = true;
					validChoice = false;
					e.printStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					continue;
				}
				finally {
				}	
			}
			while (validChoice != true && another == true);
		} else {
			System.out.println("Connection not found");
		}
		return next;
	}
	
	public boolean getTransState () {
		boolean next = false;
		boolean another = false;
		
		Scanner scanner = new Scanner(System.in);
		String state = null;
		boolean foundConnection = DAO.connect();

		if (foundConnection) {
		
			do {
				try {
					System.out.println("Please enter the 2-character state code in ALL CAPS for the branches of the transactions you would like to query below:");

					state = scanner.nextLine();
						try {
							DAO dao = new DAO();
							Transaction trans = new Transaction();
							trans = dao.getTransSt(state);
							System.out.println("There are " + trans.getTransID() + " transactions with a total value of $" + trans.getDollarValue() + " for the branches in: "+state);
							System.out.println("");
							another = false;
							System.out.println("Press 0 to exit, 9 to go back to the main menu, or any other number to query another state.");
							short nextChoice = scanner.nextShort();
							if (nextChoice == 9) {
								dao.close();
								next = true;
								scanner.nextLine();
								break;
							}
							else if (nextChoice == 0) {
									dao.close();
									scanner.close();
									break;
							}
							else {
								another = true;
								scanner.nextLine();
								continue;
							}

						} catch (ClassNotFoundException | SQLException e) {
							another = true;
							System.out.println("Please try again.");
							scanner.nextLine();
							continue;
						}
							}
				catch(InputMismatchException | NumberFormatException numberInputException){
					another = true;
					System.out.println(numberInputException);
					System.out.println("Not a valid choice. Please try again");
					System.out.println();
					scanner.nextLine();
					continue;
				}
				catch(Exception e) {
					another = true;
					e.printStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					continue;
				}
				finally {
				}	
			}
			while (another == true);
		} else {
			System.out.println("Connection not found");
		}
return next;	
	}
	public boolean getTransBetweenDates () {
		boolean next = false;
		
		Scanner scanner = new Scanner(System.in);
		long custSSN = 0;
		short year1 = 0;
		short year2 = 0;
		short month1 = 0;
		short month2 = 0;
		short day1 = 0;
		short day2 = 0;
		boolean validChoice = false;
		boolean foundConnection = DAO.connect();

		if (foundConnection) {
		
			do {
				try {
					System.out.println("Please enter the SSN without any spaces or dashes for the customer you would like to query.");
					custSSN = scanner.nextLong();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid SSN. Please try again");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
				}
				validChoice = true;

			}
			while (validChoice != true);
			
			validChoice = false;
			do {
				try {
					System.out.println("Please enter the month using 2 digits for the beginning of the date range of the transactions you would like to query.");
					month1 = scanner.nextShort();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid month. Please try again.");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
				}
				validChoice = true;
			}
			while (validChoice != true);
			
			validChoice = false;
			do {
				try {
					System.out.println("Please enter the day of the month using 2 digits for the beginning of the date range of the transactions you would like to query.");
					day1 = scanner.nextShort();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid day of the month. Please try again.");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
					}
				validChoice = true;
			}
			while (validChoice != true);
			validChoice = false;
			do {
				try {
					
					System.out.println("Please enter the year using 4 digits for the beginning of the date range of the transactions you would like to query.");
					year1 = scanner.nextShort();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid year. Please try again.");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.getStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
					}
				validChoice = true;
				}
				while (validChoice != true);

			validChoice = false;
			do {
				try {
					System.out.println("Please enter the month using 2 digits for the end of the date range of the transactions you would like to query.");
					month2 = scanner.nextShort();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid month. Please try again.");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Please try again.");
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				finally {
				}
				validChoice = true;
			}
			while (validChoice != true);
			
			validChoice = false;
			do {
				try {
					System.out.println("Please enter the day of the month using 2 digits for the end of the date range of the transactions you would like to query.");
					day2 = scanner.nextShort();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					
					System.out.println(numberInputException);
					System.out.println("Not a valid day of the month. Please try again.");
					System.out.println();
					scanner.nextLine();
					validChoice = false;
					continue;
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("Please try again.");
					validChoice = false;
					scanner.nextLine();
					continue;
				}
				finally {
		
				}
				validChoice = true;
			}
			while (validChoice != true);
		
			validChoice = false;
			do {
				try {
					
					System.out.println("Please enter the year using 4 digits for the end of the date range of the transactions you would like to query.");
					year2 = scanner.nextShort();
				}
				catch(InputMismatchException | NumberFormatException numberInputException){
					validChoice = false;
					System.out.println(numberInputException);
					System.out.println("Not a valid year. Please try again.");
					System.out.println();
					scanner.nextLine();
					continue;
				}
				catch(Exception e) {
					e.getStackTrace();
					validChoice = false;
					System.out.println("Please try again.");
					scanner.nextLine();
					continue;
				}
				finally {
				}
				validChoice = true;
				}
				while (validChoice != true);
			try {
				DAO dao = new DAO();
				List <Transaction> list = dao.getTransBetweenDates(custSSN, month1, day1, year1, month2, day2, year2);
				System.out.println("Here is the list of transactions for customer: " + custSSN + " between " + month1 +"/" + day1 +"/" +year1+ " and " + month2 +"/" + day2 +"/" +year2);
				System.out.println("");
				for (Transaction trans: list) {
					System.out.println("Transaction ID: "+ trans.getTransID());
					System.out.println("Date: "+trans.getDate());
					System.out.println("Credit Card Number: "+trans.getCc());;
					System.out.println("Branch Code: "+trans.getBranchCode());
					System.out.println("Transaction Type: "+trans.getTransType());
					System.out.println("Transaction Value: $"+trans.getTransValue());
					System.out.println("");
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		
		} else {
			System.out.println("Connection not found");
		}
		
		validChoice = false;
		do {
			try {
				System.out.println("Press 0 to exit, or 9 to go back to the main menu.");
				short nextChoice = scanner.nextShort();
				if (nextChoice == 9) {
					next = true;
					scanner.nextLine();
				}
					else {
						scanner.close();
				}
			}
			catch(InputMismatchException | NumberFormatException numberInputException){
				
				System.out.println(numberInputException);
				System.out.println("Not a valid choice. Please try again.");
				System.out.println();
				scanner.nextLine();
				continue;
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Please try again.");
				scanner.nextLine();
				continue;
			}
			finally {
			}
			validChoice = true;
		}
		while (validChoice != true);
		
		return next;
	}
}
