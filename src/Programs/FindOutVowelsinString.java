package Programs;

public class FindOutVowelsinString {
	
	
	public static void main(String[] args) {
		
		
		String s1 = "Mphasis";
		 
		
		
		           int count =0;
		for(int i=0;i<s1.length();i++)
		{
             if(s1.toUpperCase().charAt(i)=='A' || s1.toUpperCase().charAt(i)=='I' ||s1.toUpperCase().charAt(i)=='E' || s1.toUpperCase().charAt(i)=='O' ||s1.toUpperCase().charAt(i)=='U')
             {
            	 count++;
             }
		
	}
		if(count==0)
		{
			System.out.println("In given string there is no vowles");
		}
		else
		{
			System.out.println("The Number of vowels in the given string: " +count);
		}
	
	}
}
	
           
	
	


