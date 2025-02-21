package String;

public class RS {
	public static void main(String[] args) {
		
		String s1 ="Datta Sai Vinay";
		String s2 ="";
		String[] s3 = s1.split(" ");
		
		for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		System.out.println(s2);
		
		StringBuilder d1 = new StringBuilder();
		
	       for (String string : s3) {
	    	   
	    	   StringBuilder d2 = new StringBuilder(string); 
	    	   System.out.print(d2.reverse().append(" "));
	    	  // d1.append(d2.reverse().append(" "));
			
		}
	       System.out.println(d1);
	}

}
