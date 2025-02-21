package interview;

public class Ingivenstringfinduppercaseandlowercase {
	
	public static void main(String[] args) {
		
		String s1="Datta Sai";
		
		int lowercase =0;
		int uppercase=0; 
		
		           for(int i=0;i<s1.length();i++)
		           {
		        	  char a= s1.charAt(i);
		        	  
		        	  if(Character.isUpperCase(a))
		        	  {
		        		  uppercase++;
		        	  }
		        	  else if(Character.isLowerCase(a))
		        	  {
		        		  lowercase++;
		        	  }
		        	  
		        	        
		           }
		           System.out.println(lowercase);
		           System.out.println(uppercase);
	}

}
