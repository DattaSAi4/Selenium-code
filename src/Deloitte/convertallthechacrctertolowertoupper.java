
package Deloitte;

public class convertallthechacrctertolowertoupper {
	
	public static void main(String[] args) {
		
		String a="Datta Sai Vinay";
		 
	  StringBuilder s8 = new StringBuilder(a.length());
		          
		                char[] c = a.toCharArray();
		           
		           for(char s:c)
		           {
		        	   if(Character.isLowerCase(s))
		        	   {
		        		 s8.append(Character.toUpperCase(s));  
		        	   }
		        	   if(Character.isUpperCase(s))
		        	   {
		        		   s8.append(Character.toLowerCase(s));
		        	   }
		           }
		           System.out.println(s8);
	}

}
