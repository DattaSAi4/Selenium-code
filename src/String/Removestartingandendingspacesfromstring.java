//Write a java program to remove all starting and ending spaces from a string
//<Space><space><Helloworld><space>

package String;

public class Removestartingandendingspacesfromstring {
	
	public static void main(String[] args) {
		   
		String s1  ="<Space><space><Helloworld><space>";
		
	    String s2 ="<Space><space><Helloworld><space>";
	    String trimpart = "<space><space>";
	   
	       
	       //start with
	       if(s2.startsWith(trimpart))
	       {
	    	  s2= s2.substring(trimpart.length());
	    	   System.out.println(s2);
	       }
	       //end with
	       if(s2.endsWith(trimpart))
	       {
	    	   System.out.println(s2.length());
	    	   System.out.println(trimpart.length());
	    	   s2=s2.substring(0, s2.length()-trimpart.length());//(0,(16-5)=11)
	    	   System.out.println(s2);
	       }
	      
		
	}

}
