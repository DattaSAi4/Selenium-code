package Deloitte;

public class maximumlengnthoftheArray {
	
	public static void main(String[] args) {
		
		String s1 =" I am A Automation Tester";
		
		    String s2="";
		    
		       String[] s9 = s1.split(" ");
		       
		               for(String s10:s9)
		               {
		            	      if(s10.length()>s2.length())
		            	      {
		            	    	  s2=s10;
		            	      }
		               }
		               System.out.println(s2);
	}

}
