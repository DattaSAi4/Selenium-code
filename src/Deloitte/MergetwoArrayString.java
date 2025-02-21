package Deloitte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MergetwoArrayString {
	
	public static void main(String[] args) {
		
		 int a[] = {1,2,3,45,6};
		 
		 int b[] ={2,3,4,5,67};
		 
		  int c= a.length+b.length;
		 
		
		     ArrayList<Integer> s1 = new  ArrayList<Integer>();
		          HashSet s2 = new HashSet<>();
		     
		      for(int i=0;i<a.length;i++)
		      {
		    	         s1.add(a[i]);
		      }

		      for(int i=0;i<b.length;i++)
		      {
		    	         s1.add(b[i]);
		      }
		      
		      for(int s4:s1)
		      {
		    	  s2.add(s4);
		      }
		      System.out.println(s2);
		      
		     
	}

}
