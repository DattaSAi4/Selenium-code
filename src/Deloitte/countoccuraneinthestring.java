package Deloitte;

import java.util.HashMap;
import java.util.HashSet;

public class countoccuraneinthestring {
	
	

	public static void main(String[] args) {
		
		String s1 ="datta Sai Vinay";
		
		      HashMap<Character,Integer> s2 = new HashMap<Character,Integer>();
		      
		      
		              char[] s4 = s1.toCharArray();
		              
		              for(char s5:s4)
		              {
		            	  if(s2.containsKey(s5))
		            	  {
		            		  s2.put(s5, s2.get(s5)+1);
		            	  }
		            	  else
		            	  {
		            		  s2.put(s5, 1);
		            	  }
		              }
		              System.out.println(s2);
		              
	}

}
