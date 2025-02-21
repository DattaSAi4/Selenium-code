package Deloitte;



public class Prime {
	
	public static void main(String[] args) {
		
		int b =10;
		
		for(int i=2;i<=b;i++)
		{
		       if(prime(b)==1)
		       {
		    	   System.out.println("The prime number till "+b+":" +b);
		       }
		}
	
	}
	
	public static  int prime(int a)
	{
		if(a<=1)
		{
		return 0;
		}
		
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				return 0;
			}
			
		}
		return 1;
		
	}

}
