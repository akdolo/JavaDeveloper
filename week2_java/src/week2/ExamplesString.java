package week2;

public class ExamplesString {
	
	public static void main(String[] args) 
    
    {
    	reversesEveryWordInStringInPlace("Hello class, lets think string manipulation");
    }

	    static void reversesEveryWordInStringInPlace (String inputSentence){
	    	
	        String[] words = inputSentence.split(" ");
	         
	        String reverseSentence = "";
	         
	        for (int i = 0; i < words.length; i++) 
	        	
	        {
	            String word = words[i];
	             
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	             
	            reverseSentence = reverseSentence + reverseWord + " ";
	        }
	         
	        System.out.println("The original sentence: ");
	        
	        System.out.println("");
	        
	        System.out.println(inputSentence);
	        
	        System.out.println("");
	        
	        System.out.println("");
	        
	        System.out.println("The reverse of the sentence: ");
	        
	        System.out.println("");
	         
	        System.out.println(reverseSentence);
	         
	    }
	     
	}