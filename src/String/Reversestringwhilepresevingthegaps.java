package String;

import java.util.ArrayList;
import java.util.List;

public class Reversestringwhilepresevingthegaps {
	
	public static void main(String[] args) {
		
		String s1 ="Datta Sai Vinay";
            ArrayList<Character> s4 = new ArrayList<>();
		
	        char[] c1= 	s1.toCharArray();
	        
	        for (char c : c1) 
	        {
	            if (c != ' ')
	            {
	            	s4.add(c);
	            }
	        }
	        System.out.println(s4);
	        
	        //reverse the string 
	         int n =s4.size();
	         for(int i=0;i<n/2;i++)
	         {
	        	 char temp =  s4.get(i);
	        	 s4.set(i, s4.get(n-i-1));//(1,y)
	        	 s4.set(n-i-1, temp);//(12,D)
	         }
	         System.out.println(s4);
	         //rebuild the string with reverse letters
	         StringBuilder s9 = new StringBuilder();
	         int letterindex=0;
	         for( char s10 :c1)
	         {
	        	 if(s10==' ')
	        	 {
	        		 s9.append(s10);
	        	 }
	        	 else
	        	 {
	        		 s9.append(s4.get(letterindex++));
	        	 }
	         }
	         System.out.println(s9.toString());
	}

}
