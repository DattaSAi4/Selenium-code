package Testing;

public class palidrome {
	
	public static void main(String[] args) {
		
		int i=808;
		int s =808;
		int d=0;
		
		while(i!=0)
		{
	             int sum	=	i%10;
	             
	                   d= d*10+sum;
	                 i=i/10;  
	                   
	             
		}
		System.out.println(d);
		if(s==d)
		{
			System.out.println("the given number is a plaidrome ");
		}
		
		else
		{
			System.out.println("The given number is not a palidrome");
		}
		
	}


}
