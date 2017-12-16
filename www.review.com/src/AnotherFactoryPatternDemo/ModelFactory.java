package AnotherFactoryPatternDemo;

// Create factory to generate object of type model
public class ModelFactory {
	//get object of type model
	public Model getModel(String modelType){
		if (modelType == null){
			return null;
		}
		if (modelType.equalsIgnoreCase("TOYOTA")){
			return new Toyota();
		}
		else if (modelType.equalsIgnoreCase("FORD")){
			return new Ford();
		}
		else if (modelType.equalsIgnoreCase("HONDA")){
			return new Honda();
		}
		return null;
	}
}
