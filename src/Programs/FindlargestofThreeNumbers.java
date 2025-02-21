package Programs;

public class FindlargestofThreeNumbers {

	
	public static void main(String[] args) {
		int a =10;
		int b =20 ;
		int c =30;
		
		if(a>b && a>c)
		{
			System.out.println("The greatest number is "+a);
		}
		else if	(b>a && b>c)
		{
			System.out.println("The greatest number is "+b);
		}
		else
		{
		System.out.println("The greatest number is "+c);
	}
		
		//int l1 = a>b?a:b;
		//int l2 =a>l1?a:l1;
		//System.out.println(l2);
	}
	
	

	
}
