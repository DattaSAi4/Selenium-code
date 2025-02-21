package Afteralong;


public class Prime_Number {
	
	public static  boolean number(int n)
	{
		if(n==0)
		{
			return false;
		}
		if(n==1||n==2)
		{
			return true;
		}
		for(int i =1;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		       System.out.println(number(1));
		       System.out.println(number(4));
		       
	}
}
