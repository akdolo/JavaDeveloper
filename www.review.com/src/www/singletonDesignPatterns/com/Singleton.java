package www.singletonDesignPatterns.com;

public class Singleton {
	int count = 0;
	private static Singleton singleton = new Singleton();
	/*
	 *create a private constructor
	 *this prevents any other class from calling it 
	 *and instantiating an object of the class
	 */	
	public static Singleton getInstance(){
		return singleton;
	}
	public void hello(){
		System.out.println("Singleton is here!!!");
	}
}
