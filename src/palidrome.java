
public class palidrome {
	
	public static void main(String[] args) {
		
		int a=191;
		int f=a;
		
		int rev=0;
		 while(a!=0	 )
		 {
			 int sum =a%10;
			 rev=rev*10+sum;
			 a=a/10;
			 
		 }
		 if(f==rev
				 ) {
			 System.out.println("The given is palidrome");
			 
		 }
		 else
		 
		 {
			 System.out.println("The given number is not palidrome");
		 }
	}

}
