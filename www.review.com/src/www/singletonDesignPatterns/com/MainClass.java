package www.singletonDesignPatterns.com;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * SINGLETON
		 * must use the getInstance() method to 
		 * instantiate singleton class
		 */
		Singleton single1 = Singleton.getInstance();
		single1.hello();
		System.out.println(single1.count);
		
		Singleton single2 = Singleton.getInstance();
		single2.count++;
		System.out.println(single2.count);
		
		/*
		 * FACTORY DESIGN PATTERN
		 * Here, we create an object without exposing 
		 * creation logic to the client. We refer to the 
		 * newly created object using a common interface
		 */
		ToolFactory factory = new ToolFactory();
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a tool to fix the car");
		String tool = input.nextLine().toLowerCase();
		
		Tool t = factory.useToolToFix(tool);
		System.out.println(t.fix());
	}
}
