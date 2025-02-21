package interview;

public class Addtwonumberwithoutthirdvariable {
	
	public static void main(String[] args) {
		
		int a =10;
		int b=20;
		System.out.println("Before swapping a = "+a);
		System.out.println("Before swapping b = "+b);
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;//10
		System.out.println("After swapping a = "+a);
		System.out.println("After swapping b = "+b);
	}

}
