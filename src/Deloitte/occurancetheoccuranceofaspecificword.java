package Deloitte;

public class occurancetheoccuranceofaspecificword {
	
	public static void main(String[] args) {
		int count=0;
		String s1="I am from america i wanna go by to america  i i i i i i";
		
		String s2="I";
		
		           String[] s9 = s1.split(" ");
		           
		                    for(String s10:s9)
		                    {
		                    	if(s10.equalsIgnoreCase(s2))
		                    	{
		                    		count++;
		                    	}
		       
		                    }
		                    System.out.println(count);
	}

}
