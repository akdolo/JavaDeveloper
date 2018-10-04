package week2;

public class LoopContinueExample {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i ++) {
			
			if (i % 2 == 0) {
				
				if (true) {
					System.out.println("even");
				}
				
				continue;
			}else {
			System.out.println(i);
		}
	}
		
		}
}

