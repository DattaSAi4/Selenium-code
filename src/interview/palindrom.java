package interview;

public class palindrom {
	
	 static int  rev =0;
	
	public  static  int  pal( int a){
		
		
		
		while(a!=0)
		{
			int digit = a%10;//0------->1------>0
			System.out.println(digit);
			rev=rev*10+digit;//0------->11------>10
			System.out.println(rev);
			a=a/10;//21------------>2
			System.out.println(a);
			System.out.println(rev);
			
		}
		return rev;
		}
	
	public static void main(String[] args) {
		
	        int num =210;
              pal(num);
            if(rev==num)
            {
            	System.out.println("The given number is palidrom");
            }
            else
            {
            	System.out.println("Teh given number is not a palidrom");
            }
            System.out.println(2%10);
            System.out.println(2/10);
            
               
               
}
}
