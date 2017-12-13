package www.exception.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

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

