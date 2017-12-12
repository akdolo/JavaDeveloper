package example_interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {

	public static void openFile() throws FileNotFoundException {
		new FileInputStream("C:\\DoesNotExist.txt");
	}
	
	public static void main(String[] args) {
		
		try {
			openFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("The application has recovered from the exception!");
	}
}
