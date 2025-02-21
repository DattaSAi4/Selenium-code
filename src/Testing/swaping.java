package Testing;

public class swaping {
	
	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		System.out.println("before swaping"+a);
		System.out.println("After Swaping"+b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("AfterSwapping"+a);
//		System.out.println("After swapping "+b);
		
		int c=b;
		b=a;
		a=c;
		System.out.println("AfterSwapping"+a);
		System.out.println("After swapping "+b);
		
		
	}
	

}
