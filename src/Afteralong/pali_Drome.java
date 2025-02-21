package Afteralong;

public class pali_Drome {
	
	static int sum=0;
public static int palidrome(int n)
{
	
	while(n!=0)
	{
		int a = n%10;
		 sum= sum*10+a;
		     n=n/10;
		     
	}
	return sum;
	
}
public static void main(String[] args) {
	
	       int n=123;
	        palidrome(n);
	        
	        if(n==sum)
	        {
	        	System.out.println("The given number is a palidrome");
	        }
	        else
	        {
	        System.out.println("The given number is not a  palidrome");
	        }
}

}
