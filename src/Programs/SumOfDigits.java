package Programs;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int a=432;
		int rev=0;
		while(a!=0)
		{
			int add = a%10;//
			
			 rev=rev+add;
			 a=a/10;
			
		}
		System.out.println(rev);
	}

}
