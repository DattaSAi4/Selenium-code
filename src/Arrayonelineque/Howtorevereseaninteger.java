package Arrayonelineque;

public class Howtorevereseaninteger {
	
	public static void main(String[] args) {
		
		int a = 123;
		
		int rev=0;
		while(a!=0)
		{
			int sum= a%10;
			 rev=rev*10+sum;
			 a=a/10;
			
		}
		System.out.println(rev);
	}

}
