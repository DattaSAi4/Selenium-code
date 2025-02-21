package Deloitte;

public class Palidrome {
	
	public static void main(String[] args) {
		
		int a=234;
		int b=234;
		int rev=0;
		while(a!=0)
		{
			int v =a%10;
			rev=rev*10+v;
			a=a/10;
		}
		
		if(b==rev)
		{
			System.out.println("The given number is palidrome");
		}
		else
		{
			System.out.println("The given number is not palidrome");
		}
	}

}
