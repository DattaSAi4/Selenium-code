package Testing;

public class primenumber {
	
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
		for(int i=2;i<n/2;i++ )
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
		System.out.println(number(2));//true
		System.out.println(number(3));//true
		System.out.println(number(4));
		System.out.println(number(5));//true
		System.out.println(number(6));
		System.out.println(number(7));//true
		System.out.println(number(8));//true
		System.out.println(number(11));//true
		
	}

}
