package Linkdin;

import java.util.HashMap;

public class countoccuranceofarray {
	
	public static void main(String[] args) {
		
		int[] b = {1,2,3,45,6,4,1,2};
		
		               HashMap<Integer,Integer> c = new  HashMap<>();
		
		            
		               
		              for(int s5:b)
		              {
		            	  if(c.containsKey(s5))
		            	  {
		            		  c.put(s5,  c.get(s5)+1);
		            	  }
		            	  else
		            	  {
		            		  c.put(s5, 1);
		            	  }
		            	  
		            	  
		              }
		              System.out.println(c);
		}
	

}
