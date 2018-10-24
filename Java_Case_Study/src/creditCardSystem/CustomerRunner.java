package creditCardSystem;

import dao.DAO;
import pojos.Customer;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerRunner extends DAO {
	
	public boolean getCustDetails () {
		boolean next = false;
		boolean another = false;
		
		Scanner scanner = new Scanner(System.in);
		
		boolean foundConnection = DAO.connect();
		
		long custSSN = 0;

		if (foundConnection) {
		
			do {
				try {
					System.out.println("Please enter the SSN (just numbers no spaces) of the customer you would like to view:");

					custSSN = scanner.nextLong();
						try {
							DAO dao = new DAO();
							Customer cust = new Customer();
							cust = dao.getCustDetails(custSSN);
							System.out.println("The customer information details for SSN = " + custSSN);
							System.out.println("First Name: "+cust.getCustFirstName());
							System.out.println("Middle Name: "+cust.getCustMiddleName());
							System.out.println("Last Name: "+cust.getCustLastName());
							System.out.println("Credit Card Number: "+cust.getCc());
							System.out.println("Apartment Number: "+cust.getCustApt());
							System.out.println("Street Name: "+cust.getCustStreetName());
							System.out.println("City: "+cust.getCustCity());
							System.out.println("State: "+cust.getCustState());
							System.out.println("Zip Code: "+cust.getCustZip());
							System.out.println("Country: "+cust.getCustCountry());
							System.out.println("Phone Number: "+cust.getCustPhone());
							System.out.println("Email Address: "+cust.getCustEmail());
							System.out.println("Recent Updated: "+cust.getLastUpdated());
							System.out.println("");
							another = false;
							System.out.println("Please, enter 9 to go back to the main menu, or any other number to view another customer, or 0 to exit.");
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
							e.printStackTrace();
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
	
	public boolean updateCustDetails () {
		boolean next = false;
		boolean another = false;
		
		Scanner scanner = new Scanner(System.in);
		long custSSN = 0;
		short choice = 0;
		
		boolean validChoice = false;
		
		String updateField = null;
		String updateString = null;
		long updateLong = 0;
		
		String updateTimeStamp = null;
		
		boolean foundConnection = DAO.connect();

		if (foundConnection) {
		
			do {
				try {
					System.out.println("Please enter the SSN(just numbers no spaces) for the customer you would like to update:");

					custSSN = scanner.nextLong();
					
					scanner.nextLine();
					System.out.println("Please enter a number from the menu below for the field you want to update for this customer:");
					System.out.println("Please enter 1 to update the customer's first name.");
					System.out.println("Please enter 2 to update the customer's middle name.");
					System.out.println("Please enter 3 to update the customer's last name.");
					System.out.println("Please enter 4 to update the customer's credit card number.");
					System.out.println("Please enter 5 to update the customer's apartment number.");
					System.out.println("Please enter 6 to update the customer's street name.");
					System.out.println("Please enter 7 to update the customer's city.");
					System.out.println("Please enter 8 to update the customer's state.");
					System.out.println("Please enter 9 to update the customer's zip code.");
					System.out.println("Please enter 10 to update the customer's country.");
					System.out.println("Please enter 11 to update the customer's phone number.");
					System.out.println("Please enter 12 to update the customer's email address.");
					
					choice = scanner.nextShort();
					if((choice >= 1) && (choice <= 12)) {
						validChoice = true;
						switch (choice) {
							case (1):{
								updateField = "FIRST_NAME";
								scanner.nextLine();
								System.out.println("Please enter the customer's first name:");
								updateString = scanner.nextLine();
								break;
							}
							case (2):{
								updateField = "MIDDLE_NAME";
								scanner.nextLine();
								System.out.println("Please enter the customer's middle name:");
								updateString = scanner.nextLine();
								break;
							}
							case (3):{
								updateField = "LAST_NAME";
								scanner.nextLine();
								System.out.println("Please enter the customer's last name:");
								updateString = scanner.nextLine();
								break;
							}
							case (4):{
								updateField = "CREDIT_CARD_NO";
								scanner.nextLine();
								System.out.println("Please enter the customer's credit card number:");
								updateLong = scanner.nextLong();
								break;
							}
							case (5):{
								updateField= "APT_NO";
								scanner.nextLine();
								System.out.println("Please enter the customer's apartment number:");
								updateString = scanner.nextLine();
								break;
							}
							case (6):{
								updateField ="STREET_NAME";
								scanner.nextLine();
								System.out.println("Please enter the customer's street name:");
								updateString = scanner.nextLine();	
								break;
							}
							case (7):{
								updateField = "CUST_CITY";
								scanner.nextLine();
								System.out.println("Please enter the customer's city:");
								updateString = scanner.nextLine();
								break;
							}
							case (8):{
								updateField = "CUST_STATE";
								scanner.nextLine();
								System.out.println("Please enter the customer's state:");
								updateString = scanner.nextLine();	
								break;
							}
							case (9):{
								updateField = "CUST_ZIP";
								scanner.nextLine();
								System.out.println("Please enter the customer's zip code:");
								updateString = scanner.nextLine();
								break;
							}
							case (10):{
								updateField = "CUST_COUNTRY";
								scanner.nextLine();
								System.out.println("Please enter the customer's country:");
								updateString = scanner.nextLine();	
								break;
							}
							case (11):{
								updateField = "CUST_PHONE";
								scanner.nextLine();
								System.out.println("Please enter the customer's phone number(just numbers no space):");
								updateLong = scanner.nextLong();
								break;
							}
							case (12):{
								updateField = "CUST_EMAIL";
								scanner.nextLine();
								System.out.println("Please enter the customer's email address:");
								updateString = scanner.nextLine();	
								break;
							}
						}
						try {
							DAO dao = new DAO();
							Date date = new Date();
							DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							updateTimeStamp = dateFormat.format(date);
							switch (choice) {
								case (1):
								case (2):
								case (3):
								case(4):
								case (5):
								case (6):
								case (7):
								case (8):
								case (9):
								case (10):
								case (12):{
									if (dao.updateCustDetails(updateField, updateString, custSSN) && dao.updateCustDetails("LAST_UPDATED", updateTimeStamp, custSSN)) 
											System.out.println(updateField + " successfully updated for customer: "+custSSN+ " to: "+updateString);
									else
											System.out.println(updateField + " could not be updated for customer: "+custSSN);
					
									break;
									}
								case(11):{
									if (dao.updateCustDetails(updateField, updateLong, custSSN) && dao.updateCustDetails("LAST_UPDATED", updateTimeStamp, custSSN)) 
										System.out.println(updateField + " successfully updated for customer: "+custSSN+ " to: "+updateLong);
									else
										System.out.println(updateField + " could not be updated for customer :"+custSSN);
									
									break;
									}
								
								}
								
							System.out.println();
							System.out.println("Please, enter 9 to go back to the main menu, or any other number to view another customer, or 0 to exit.");
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
	
}
