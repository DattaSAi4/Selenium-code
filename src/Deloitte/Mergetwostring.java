package Deloitte;

import java.util.ArrayList;

public class Mergetwostring {
	
	public static void main(String[] args) {
		
		String[] s1= {"sai","Vinay","Datta"};
		
		String[]  s2={"america","preeti","kumari"};
		
		ArrayList s6 = new ArrayList<String>();
		ArrayList s7 = new ArrayList<String>();
		                      
		
		         for(int i=0;i<s1.length;i++)
		         {
		        	    s6.add(s1[i]);
		         }
		         for(int i=0;i<s2.length;i++)
		         {
		        	    s6.add(s2[i]);
		         }
		        System.out.println(s6);
		
	}

}
