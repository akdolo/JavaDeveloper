package www.somereviews.com;

/*Constructor overloading is a technique in Java 
 * in which a class can have any number of constructors that differ in parameter lists.The compiler differentiates these constructors by taking into account the number 
 * of parameters in the list and their type..
 * */
public class Employee {

	String name;
	int id;
	int age;
	
	Employee(int i, String n){
		id = i;
		name = n;
	}
		//System.out.println(id + " " + name);
	Employee(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}
	void display(){
		System.out.println(id + " " + name + " " + age);
		
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(231, "Ichaka", 45);
		Employee e2 = new Employee(546, "Fanta", 24 );
		
		e1.display();
		e2.display();
		
	}
}
