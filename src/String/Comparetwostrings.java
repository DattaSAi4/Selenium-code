//compare two strings if the character  in string1 are present in String2, Then it should be printed as such  in output ,
//else '+' should be printed in output 
//input1:NewYork input2:NWYR  output:N+w+Y+r



package String;

public class Comparetwostrings {
	
	public static void main(String[] args) {
		
		String s1 ="New York";
		String s2 = "NwYr";
		String s3= s1+s2;
		
		 StringBuilder result = new StringBuilder();
	         for( char s4 :s1.toCharArray())
	         {
	        	 if(s2.indexOf(s4)>=0)
	        	 {
	        		result= result.append(s4);
	        	 }
	        	 else
	        	 {
	        		 result =result.append('+');
	        	 }
	        	 
	        	 //result.toString();
	        	
	         }
	         System.out.println(result);
			
	}

}
