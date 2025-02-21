package Afteralong;

public class vowelpresentinstring {
	
	
	
	public static void main(String[] args) {
		String s1 ="Diuyt";
		
		String s2 ="aieouAIEOU";
		
		      if(s2.equalsIgnoreCase(s1))
		      {
		    	  System.out.println("in presentstringvowelsare present");
		      }
		      System.out.println("In present string vowels are not there");
		      
		      s1.toLowerCase().matches(".*[aieouAIEOU].*");
		      System.out.println(s1.toLowerCase().matches(".*[aieouAIEOU].*"));
	}

}
