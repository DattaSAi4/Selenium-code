package Deloitte;

import java.util.HashMap;

public class Stringoccurance {
	
	public static void main(String[] args) {
		
		String s1 ="DattSaiVinay";
		
		  HashMap<Character,Integer> s2  =  new HashMap<>(); 
		
		  for(char c:s1.toCharArray())
		  {
			           
			if(s2.containsKey(c))
			  {
				  s2.put(c, s2.get(c)+1);
			  }
			  else
			  {
				  s2.put(c, 1);
			  }
		  }
		  
		  System.out.println(s2);
		
		
	}

}
