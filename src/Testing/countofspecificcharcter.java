package Testing;

public class countofspecificcharcter {
	public static void main(String[] args) {
		
		String name ="datta Sai Vinay";
		 int count = name.length()-name.replace("a", "").length();
		 System.out.println(count);
		 
		 int count1=0;
		               String[] s2 = name.split("");
		               
		               for(String s4:s2)
		               {
		            	   if(s4.equalsIgnoreCase("a"))
		            	   {
		            		   count1++;
		            	   }
		               }
		               System.out.println(count1);
	}

}
