package Testing;

import java.util.HashSet;

public class removeruplicatefromthestring {
	
	public static void main(String[] args) {
		
		String s1 = " saia";
		
		       HashSet s2 = new HashSet<>();
		       
		    StringBuilder s3 = new   StringBuilder();
		    
		              char[] s4 = s1.toCharArray();
		              
		                          for(char s5:s4)
		                          {
		                        	      if(s2.add(s5))
		                        	      {
		                        	    	  s3.append(s5);
		                        	      }
		                          }
		                          System.out.println(s3.toString());
	}

}
