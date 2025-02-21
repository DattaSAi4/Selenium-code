package String;

import java.util.HashSet;
import java.util.Set;



public class Removeduplicatefromstrin {
	
	public static void main(String[] args) {
		
		String s1 = "Datta Sai";
		
		
		            
					 HashSet w3 = new HashSet<>();
		             
		            StringBuilder s2 = new StringBuilder();
		            
		                    char[] s3 = s1.toCharArray();
		                    
		                            for (char s5:s3)
		                            {
		                            	  if(w3.add(s5))
		                            	  {
		                            		  s2.append(s5);
		                            	  }
		                            	  
		                            }
		                            System.out.println(s2);
	}

}
