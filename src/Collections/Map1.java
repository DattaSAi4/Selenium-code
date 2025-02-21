//map:map is a interface which is provided my collections framework 

package Collections;

import java.util.*;

public class Map1 {
	
	public static void main(String[] args) {
		
	   Map<Integer ,String> m1 = new Hashtable<>();
	    
	   //Add the key value pairs to map
	   
	           m1.put(1 ,"vinay");
	           m1.put(2, "sai");
	           m1.put(3, "Datta");
	           
	    System.out.println("The key value pairs in map :" +m1);       
	   //retrive the keys from the map 
	           
	         Set<Integer> Key = m1.keySet();
	         
	          for(Integer s1:Key)
	          {
	        	  System.out.println("The keys in the map :" +s1);
	          }
	      //retrive the value from the map 
	          
	         Collection<String> value = m1.values();
	         
	          for(String v10:value)
	          {
	        	  System.out.println("The values in the map :+"+v10);
	          }
	     //retrive the value by using key 
	          
	              Set<Integer> keys1  = m1.keySet();
	              for(Integer k1:keys1)
	              {
	            	  System.out.println("By using keys displaying values :"+m1.get(k1));
	            	  
	              }
	        //          
		
	}

}
