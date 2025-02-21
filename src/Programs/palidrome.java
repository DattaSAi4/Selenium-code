package Programs;

public class palidrome {
	
	
	   static int rev=0;
		
		
		public  static int palidrome1(int number)
		{
	
		
		
		while(number!=0)
		{
			    int digit =  number%10; //1-->//7------->//0
			        rev = rev*10+digit;//1-->//17---->170
			        number=number/10;//17------->//1
		}	 																						
		System.out.println(rev);
		return rev;
		}
		
		public static void main(String[] args) {
			
			int number=172;
			palidrome1(number);
			
			if(number==rev)
			{
				System.out.println("the given number is a palidrome");
			}	
			else
			{
				System.out.println("the given number is not palidrome");
			}
		}
	
	

}

