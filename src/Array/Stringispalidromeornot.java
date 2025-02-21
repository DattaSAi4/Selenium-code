package Array;

public class Stringispalidromeornot {
	
	public static void main(String[] args) {
		
		String s1 = "preeti";
		
		String s2="";
		
		for(int i =0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
			
		}
		System.out.println(s2);
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("The given string is a palidrome");
		}
		else
		{
			System.out.println("The given string is not palidrome ");
		}
	}

}
