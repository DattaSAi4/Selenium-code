/*A prime number is a positive integer having exactly two factors, i.e. 1 and the number itself.
If p is a prime, then its only factors are necessarily 1 and p itself*/

package Programs;

public class PrimeNumber {
	

	
//	public static  boolean prime(int a)
//	{
//		if(a==0||a==1)
//		{
//			return false;
//		}
//		if(a==2)
//		{
//			return true;
//		}
//		
//		for(int i =2; i<a/2; i++)
//		{
//			if(a%2==0);
//			{
//				
//				return  false;
//			}
//		}
//		
//		
//		return true;
//		
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		//System.out.println(prime(2));
//		System.out.println(prime(3));
//		
		
	//number should be greater than >1
	//the number should have 2 factors
	public static void main(String[] args) {
		
		int a =3;
		int count=0;
		
		if(a>1)
		{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("the Given number is a prime number");
			}
			else
			{
				System.out.println("The given not a prime number");
			}
		}
		else
		{
		System.out.println("the given number is not a prime");
	}
	}

}
