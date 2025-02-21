package interview;

public class Primenumber {
	
	public static void main(String[] args) {
		
		int a = 6;
		int count =0;
		
		for(int i =1;i<=a;i++)
		{
			 if(a%i==0)
			 {
				 count++;
			 }
		}
		if(count==2)
		{
			System.out.println("The given number is prime number "+a);
		}
		else
		{
			System.out.println("The given number is not a prime number ");
		}
	}

}
