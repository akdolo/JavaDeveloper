package week2;
/*
 * Trying to put a number between 1 to 12 to display month
 */
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String yearMonth;
		
		System.out.println("Please, enter a number from 1 to 12 to display the corresponding month: ");
		
		int month = in.nextInt();
		
		switch(month) {
		case 1 :
			yearMonth = "January";
			break;
		case 2:
			yearMonth = "Fevruary";
			break;
		case 3:
			yearMonth = "Marsh";
			break;
		case 4:
			yearMonth = "April";
			break;
		case 5:
			yearMonth = "May";
			break;
		case 6:
			yearMonth = "June";
			break;
		case 7:
			yearMonth = "Jully";
			break;
		case 8:
			yearMonth = "August";
			break;
		case 9:
			yearMonth = "September";
			break;
		case 10:
			yearMonth = "October";
			break;
		case 11:
			yearMonth = "November";
			break;
		case 12:
			yearMonth = "December";
			break;
			default:
				yearMonth = "Such month does not exist";
		}
		System.out.println("Here is your chosing month: " + yearMonth);
			
			}
	}

