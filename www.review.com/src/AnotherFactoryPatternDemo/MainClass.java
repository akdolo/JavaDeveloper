package AnotherFactoryPatternDemo;

/*Use the Factory to get object of concrete 
 * class by passing an information such as type
 */
public class MainClass {

	public static void main(String[] args) {
		ModelFactory modelFactory = new ModelFactory();
		//get an object of toyota and call its model method.
		Model model1 = modelFactory.getModel("TOYOTA");
		//call model method of toyota
		model1.model();
		
		Model model2 = modelFactory.getModel("FORD");
		model2.model();
		
		Model model3 = modelFactory.getModel("HONDA");
		model3.model();
	}
	
}
