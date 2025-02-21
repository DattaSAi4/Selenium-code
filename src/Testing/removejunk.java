package Testing;

public class removejunk {
	
	public static void main(String[] args) {
		String s1="!@#$^%&^*&(*)(*&^%%Dattasai";
		
		String junk = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(junk);
		
		String s3="!@#%$^&*())*&^%$#W@Q!$%^&*()Vinay";
		System.out.println(s3.replaceAll("[^a-zA-Z0-9]", ""));
		
		//////////////////removewhitespaces
		
		String s4="Datta Sai Vinay";
		  String s5 = s4.replace(" ", "");
		  System.out.println(s5);
		  
		  /////////////////////reverse th single word from the given string 
		  
		  String s9 ="Datta Sai Vinay";
		  String s10="Sai";
		  
		      String[] s8 = s9.split(" ");
		      
		      StringBuilder s7 = new StringBuilder();
		      
		                        
		                     for(String word:s8)
		                     {
		                    	 if(word.equalsIgnoreCase("sai"))
		                    	 {
		                    		word=  new StringBuilder(word).reverse().toString();
		                    		s7.append(word).append(" ");
		                    		
		                    	 }
		                    	 System.out.println(s7);
		                    	
		                     }
		                     
		   
	}
            
	 

}
