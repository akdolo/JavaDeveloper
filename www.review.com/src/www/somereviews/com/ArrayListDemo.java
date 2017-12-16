package www.somereviews.com;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		System.out.println("The initial size of the array list is: " + arr.size());
		arr.add("A");
		arr.add("B");
		arr.add("D");
		arr.add("O");
		arr.add("U");
		arr.add("L");
		
		System.out.println("Size of array after additions: " + arr.size());
		
		System.out.println("Contents of array: " + arr);
		
		arr.remove("B");
		arr.remove("A");
		arr.remove("U");
		arr.add("O");
		System.out.println("Size of array after deletions: " +arr.size());
		System.out.println("Contents of array: " + arr);
	}

}
