package String;

public class countspecificcharcteroccuranceinstring {
	
	public static void main(String[] args) {
		 
		String name ="Datta Sai Vinay";
			       
		       int count =0;
		       for(int i =0;i<name.length();i++)
		       {
		    	   if(name.charAt(i)=='a')
		    	   {
		    		   count++;
		    	   }
		       }
		       if(count==0)
		       {
		    	   System.out.println("There is no A letter in a string ");
		       }
		       System.out.println("The  count of A occurance in a String " +count);
	}

}
