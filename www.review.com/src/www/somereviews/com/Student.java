package www.somereviews.com;
/*This example, is the values of one object 
 * into another using java constructor.
 * */
public class Student {
	int id;
	String name;
	
	Student(int i, String n){
		id = i;
		name = n;
		
	}
	Student(Student s){
		id = s.id;
		name = s.name;
	}
	void display(){
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) {
		Student s1 = new Student(233, "Jeff");
		Student s2 = new Student(s1);
		s1.display();
		s2.display();
	}

}
