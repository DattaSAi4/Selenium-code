package Afteralong;

public class Swaptwonumber {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("Before swapping a:"+a);
		System.out.println("Before Swapping b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a:"+a);
		System.out.println("After Swapping b:"+b);
	}
}
