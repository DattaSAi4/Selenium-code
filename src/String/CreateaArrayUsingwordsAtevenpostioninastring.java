//Write a Java Program  to create a Array  using words  at even postion  in a string
//input: java is  super keka  easy and welcome    output: {"is","keka","and"}
     //   1    2   3     4      5   6   7
////            is       keka       and

package String;

import java.util.ArrayList;

public class CreateaArrayUsingwordsAtevenpostioninastring {
	
	public static void main(String[] args) {
		
		
		String d1 ="java is super keka easy and welcome";
		
		String[] sp = d1.split(" "); 
		//System.out.println(d1.split(" ").length);
		
		ArrayList<String >s1 = new  ArrayList();
		
		for(int i=1;i<sp.length;i+=2)
		{
			   s1.add(sp[i]);
		}
		
		 
		         
		         String[] array = new String[s1.size()];
		         array = s1.toArray(array);
		         
		         for(String s9:array)
		         {
		        	System.out.println(s9); 
		         }
		         
		
		
	}

}
