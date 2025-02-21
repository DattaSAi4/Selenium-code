package interview;

import java.util.ArrayList;
import java.util.Iterator;

public class MergetwoArraysStrings {

	public static void main(String[] args) {


		         String s1[] = {"Datta","Sai","Vinay"};
		         
		         String s2[] = {"Pabbineedi"};
		         
		         int f = s1.length+s2.length;
		         
		         String s3[] = new String[f];
		         
		         ArrayList<String> s9 = new ArrayList<String>();
		          
		         
		         int c=0;
		         
		         for(int i=0;i<s1.length;i++)
		         {
		        	 
		        	 s9.add(s1[i]);
		        	// s3[c] =s1[i];
		        	  // c++;
		             
		         }
		        
		         for(int s =0;s<s2.length;s++)
		         {
		        	 s9.add(s2[s]);
		        	// s3[c]=s2[s];
		        	 //c++;
		         }
		         System.out.println(s9);
		         for(String s7:s9 )
		         {
		        	 System.out.print(""+s7+"");
		         }
 	}
}
