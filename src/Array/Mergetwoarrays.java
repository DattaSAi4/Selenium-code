package Array;

import java.util.ArrayList;


public class Mergetwoarrays {
	
	public static void main(String[] args) {
		
		String s1[] = {"vinay","sai","super"};
		
		String s2[] = {"datta","sai","vinay"};
		
		   ArrayList<String> string1 = new ArrayList<String>();
		   
		      ArrayList<String> string2 = new ArrayList<String>();
		      
		      for(String  na:s1)
		      {
		    	  string1.add(na);
		      }
		      
		      for(  String sw:s2)
		      {
		    	  string1.add(sw);
		      }
		      System.out.println(string1);
	}

}
