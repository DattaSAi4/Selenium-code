package Afteralong;

public class Stringreverse {
public static void main(String[] args) {
	
	String s1 = "DattaSaiVinay";
	String s2 ="";
	
	for(int i=0;i<s1.length();i++)
	{
		 char s3 = s1.charAt(i);
		 s2=s3+s2;
	}
	System.out.println(s2);
	
}
}
