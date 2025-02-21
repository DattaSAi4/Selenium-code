package Deloitte;

import java.util.ArrayList;
import java.util.Arrays;

public class Stringd {

	
	public static void main(String[] args) {
		
		 String s1="who am i";
		 
		 String s2=" ";
		 
		    
		 ArrayList<Integer> s4 = new  ArrayList<Integer>();
		 
		 for(int i=0;i<s1.length();i++)
		 {
			 if(s1.charAt(i)==' ')
			 {
				   s4.add(i);
				 continue;
			 }
			     s2=s1.charAt(i)+s2;
		 }
		 System.out.println(s2);
		 
	         StringBuilder s9 = new	 StringBuilder(s2);
	         
	          for(int s10:s4)
	          {
	        	  s9.insert(s10, ' ' );
	          }
	         System.out.println(s9);
	}
}
