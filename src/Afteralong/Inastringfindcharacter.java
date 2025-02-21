package Afteralong;

import java.util.HashMap;
import java.util.Map;

public class Inastringfindcharacter {
	
	public static void main(String[] args) {
		 String s1 ="Datta Sai Vinay";
		// System.out.println(s1.length());
		 //System.out.println(s1.split(s1).length);
		 
		           char[] s3 = s1.toCharArray();
		    Map<Character, Integer>  s11=  new HashMap<>();
		    
		    for(char s4:s3)
		    {
		    	if(s11.containsKey(s4))
		    	{
		    		s11.put(s4, s11.get(s4)+1);
		    	}
		    	else
		    	{
		    		s11.put(s4, 1);
		    	}
		    	
		    	}
		    System.out.println(s11);
		    }
		 
		    
		    
	}


