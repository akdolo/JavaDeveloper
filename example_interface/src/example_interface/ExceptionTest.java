package example_interface;

public class ExceptionTest {

public static void main(String[] args) {
		
		try {
			System.out.println("1 / 0 = " + (1 / 0));
		} catch (ArithmeticException e) {
			System.out.println("Caught an arithmetic exception!");
			// print the stack trace programmatically
			e.printStackTrace();
		} finally {
			
			System.out.println("This is the optional \"finally\" block.");
		}
		
		System.out.println("The code has continued on, as normal!");
		
	}
}

