
public class Reverseaspecifword {

	public static void main(String[] args) {
		
		String name ="Datta Sai Vinay";
		
		 String[] s3 = name.split(" ");
		 
		 StringBuilder s5 = new StringBuilder();
		 
		     for(String s2:s3)
		     {
		    	   if(s2=="Sai")
		    	   {
		    		    s5.reverse();             
		    	   }
		     }
	}
}
