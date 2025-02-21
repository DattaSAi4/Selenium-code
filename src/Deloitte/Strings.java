package Deloitte;

public class Strings {
	
	public static void main(String[] args) {
		
		String s1 ="i am automation testor i i";
		
		int count =0;
		       String[] s2 = s1.split(" ");
		       
		       for(int i=0;i<s1.length();i++)
		       {
		    	        char s4 = s1.charAt(i);
		    	        
		    	        if(s4=='i')
		    	        {
		    	        	count++;
		    	        }
		    	        
		    	        
		    	      
		       }
		       System.out.println(count);
		       
	}

}
