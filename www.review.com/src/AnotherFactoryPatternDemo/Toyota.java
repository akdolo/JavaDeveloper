package AnotherFactoryPatternDemo;

//concrete class implementing the same interface
public class Toyota implements Model{

	@Override
	public void model(){
		System.out.println("Toyota is a good car!!!");
	}
	
}
