//if // conditions based statements 
//if else
//switch
//break it is the key work we wil use to stop excute 

//verify any given is even or odd
//perform the arithmatic operation on two number 
package Com.Javatopics;

import java.util.Scanner;
public class DecisionMakingStatements {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		int a =20;
		int b = 30;
		int c;
		int d;

		if(a>b)
		{
			System.out.println("A>b");
		}
		else
		{
			System.out.println("A<b");
		}


		switch(1) //value conditinal statemens

		{
		case 1: System.out.println("Case 1");
		break;
		case 2: System.out.println("Case 2");
		default: System.out.println("The case is invalid");
		}

		System.out.println("*******verify any given is even or odd using switch statement*******");
		System.out.println("Enter the number");
		c = s1.nextInt();
		d =c%2;
		System.out.println(d);
		switch(d)
		{
		case 0: System.out.println("The given number is even number "); 
		break;

		case 1: System.out.println("The given number is odd number ");
		break;

		}

		////perform the arithmatic operation on two number 

		System.out.println("****Performs the Arithmatic operation******");

		System.out.println("Enter the A value ");
		int e = s1.nextInt();
		System.out.println("Enter the B value ");
		int f = s1.nextInt();
		System.out.println("Enter the Arithmatic operater you want to perform");
		String g = s1.next();
		switch(g)
		{
		case "+":  
			int g1 = e+f;
			System.out.printf(" The Addition of %d  +  %d = %d",e,f,g1);
			break;

		case "-":
			int sub = e-f;
			System.out.printf(" The Substraction of %d  -  %d = %d",e,f,sub);
			break;

		case "*" :
			int mul = e*f;
			System.out.printf(" The multiplication of %d  *  %d = %d",e,f, mul); 
			break;
		case "/" :
			int div = e/f;
			System.out.printf(" The division  of %d  /  %d = %d",e,f, div); 
			break;

		}

	}

}



