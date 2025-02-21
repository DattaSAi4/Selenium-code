package Afteralong;
//prime
public class testing {
	
	public static boolean number(int n)
	{
		if(n==0||n==1)
		{
		return false;
		}
		if(n==2)
		{
			return true;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(number(3));
		System.out.println(number(10));
		System.out.println(number(19));
	}
	

}
