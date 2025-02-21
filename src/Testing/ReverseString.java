package Testing;

public class ReverseString {
	public static void main(String[] args) {
		String s1 ="Sai Vinay ";
		String S2 ="";
		
		for(int i=0;i<s1.length();i++)
		{
		   char s3	=  s1.charAt(i);
		   
		     S2 = s3+ S2;
		     
		}
		System.out.println(S2);
	}

}
