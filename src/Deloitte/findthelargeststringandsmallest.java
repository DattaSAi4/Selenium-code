package Deloitte;

import java.util.ArrayList;

public class findthelargeststringandsmallest {
	
	public static void main(String[] args) {
		
		 String[] s1 = {"Datta","Sai","Vinay","123456787654"};
		 
		   ArrayList<String> list = new ArrayList<String>();
		   
		               for(String s4:s1)
		               {
		            	   list.add(s4);
		               }
		               
		     String largest = list.get(0);
		     
		     String smallest = list.get(0);
		     
	             for(int i=1;i<list.size();i++)
	             {
	            	 if(largest.length()<list.get(i).length())
	            	 {
	            		 largest=list.get(i);
	            	 }
	            	 if(smallest.length()>list.get(i).length())
	            	 {
	            		 smallest=list.get(i);
	            	 }
	            	 
	            	
	             }
	             System.out.println(largest);
            	 System.out.println(smallest);
	}

}
