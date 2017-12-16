package www.singletonDesignPatterns.com;

public class ToolFactory {

	public Tool useToolToFix(String toolType){
		switch(toolType.toLowerCase()){
		case "spanner": return new Spanner();
		case "torque": return new Torque();
		//case "screw": return new Screwdriver();
		default: return null;
		}
	}
}
