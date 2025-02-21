
public class primenumber {
	
	public static void main(String[] args) {
		
		int a=31;
		
		boolean b =true;
		        if(a==0)
		        {
		        	b=false;
		        }
		        if(a==1||a==2)
		        {
		        	b=true;
		        }
		
		  for(int i=2;i<a/2;i++)
		  {
			  if(a%2==0)
			  {
				  b=false;
				  break;
			  }
		  }
		if(b)
		{
			System.out.println("The given number is prime");
		}
		else
		{
			System.out.println("the given number is not prime");
		}
	}

}
