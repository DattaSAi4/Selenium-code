package String;

public class ReverseEachwordofagivenstring {
	
	public static void main(String[] args) {
		 
		String s1 ="Datta Sai Vinay";
		
		  String[] s2 = s1.split(" ");
		  
		  StringBuilder s5 = new StringBuilder();
		 
		  
		  for(String s3:s2)
		  {
			  StringBuilder s6 = new StringBuilder(s3);
			  System.out.println(s6);
			  s5.append(s6.reverse().append(" "));
		  }
		  System.out.println(s5);
		  
		 
	}

}
