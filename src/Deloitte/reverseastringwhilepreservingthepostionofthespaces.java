package Deloitte;

import java.util.ArrayList;

public class reverseastringwhilepreservingthepostionofthespaces {
	
	
	public static void main(String[] args) {
		
		String s1 ="Datta sai Vinay";
		System.out.println("Datta Sai Vinay");
		String s2 =" ";
		
		ArrayList<Integer> s9 = new ArrayList<>();
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				s9.add(i);
				continue;
			}
			 s2=s1.charAt(i)+s2;
		}
		//System.out.println(s2);
		
		  StringBuilder s0 = new StringBuilder(s2);
		  for(int s10:s9)
		  {
			  s0.insert(s10, ' ');
		  }
		  
		  System.out.println(s0.toString());
		  
	                     
	}

}
