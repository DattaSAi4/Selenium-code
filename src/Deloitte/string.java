package Deloitte;

import java.util.ArrayList;

public class string {
	
	public static void main(String[] args) {
		
		String s1="who am i";
		
		String s2="";
		
		         ArrayList<Integer>  s10=  new ArrayList<Integer>();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ' )
			{
				s10.add(i);
				continue;
			}
			s2=s1.charAt(i)+s2;
		}
		
		  StringBuilder s9 = new StringBuilder(s2);
		  
		                 for( int s42:s10)
		                 {
		                	 s9.insert(s42, ' ');
		                 }
		                 System.out.println(s9);
		
	}

}
