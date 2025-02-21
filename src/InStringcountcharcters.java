import java.util.HashMap;
import java.util.Map;

public class InStringcountcharcters {
	
	public static void main(String[] args) {
		
		String name ="Datta Sai Vinay";
		
		        char[] eachchar = name.toCharArray();
		        
		        Map<Character, Integer>  s5 = new HashMap<>();
		        
		                  for(char s4:eachchar)
		                  {
		                	  if(s5.containsKey(s4))
		                	  {
		                		  s5.put(s4, s5.get(s4)+1);
		                	  }
		                	  else
		                	  {
		                		  s5.put(s4, 1);
		                	  }
		                	 
		                  }
		                  System.out.println(s5);
	}

}
