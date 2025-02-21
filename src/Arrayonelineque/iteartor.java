package Arrayonelineque;

import java.util.ArrayList;
import java.util.Iterator;

public class iteartor {
	public static void main(String[] args) {
		 
		String s1[] = {"Datta","Sai","Vinay"};
		
		ArrayList<String> s2 =new ArrayList<String>();
		
		s2.add("Datta");
		s2.add("Sai");
		s2.add("Vinay");
		
	   Iterator<String> s3 = s2.iterator(); 
	   
	             while(s3.hasNext())
	             {
	            	 System.out.println(s3.next());
	             }
	}
	
	
	
	       

}
