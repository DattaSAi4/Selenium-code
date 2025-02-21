
public class ReverseString {
	
	public static void main(String[] args) {
		
		String name="Datta Sai Vinay";
		
		   String gap="";
		   
		   for(int i=0;i<name.length();i++)
		   {
			    gap=name.charAt(i)+gap;
		   }
		   System.out.println(gap);
		
	}

}
