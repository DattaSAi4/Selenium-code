

package String;

public class findOutOccurences {

	public static void main(String[] args) {
		
		String s1 ="TOMOTA";
		
		    char s4 = s1.charAt(0);
		    
		    int count=0;
		    
		   
		
		for(int i=0;i<s1.length();i++)
		{
			// char s2 = s1.charAt(i);
			//System.out.println(s1.charAt(j));
			//System.out.println(s1.charAt(i));
		       
			for(int j=0;j<s1.length();j++)
			{
				
				if(i!=j)
				{
			
			         if(s1.charAt(i)==s1.charAt(j))
			         {
			        	 System.out.println("The matched element '"+s1.charAt(i));
			        	
			        	
			         }
			         
			          
		}
		}
		}
		
		
		
		
	}
}
