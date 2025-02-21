//Arithmetic operator //+,-,/,%
//unary operator 
///-->increment //decrement
// relational operator ==, !=, <, >, >=, <=
// conditional operator  (conditional And ,conditional or )
// assignment operator ,=,+=,*=
package Com.Javatopics;



import java.util.Scanner;
public class Operators {

	int a= 10;
	int b=20;

	public  void Arithmetic() {

		System.out.println("*******ARITHMETIC OPERATOR********/n");

		System.out.println(a+b);//30
		System.out.println(a-b);//10
		System.out.println(a/b);//0
		System.out.println(a%b);//2

	}

	public void unary()
	{
		System.out.println("*******UNARY OPERATOR********/n");
		System.out.println(--a);//pre decrement  //9
		System.out.println(a--);//post decrement //9
		System.out.println(a);//8
		System.out.println(++b);//pre increment//21
		System.out.println(b++);//post increment//21
		System.out.println(b);//22
		System.out.println(a+b);//30

	}

	public void relational()
	{
		System.out.println("*******RELATIONAL OPERATOR********");
		System.out.println(a=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);

	}
	public void conditional()
	{
		System.out.println("*******CONDITINAL OPERATOR********");

		if(a>b && a!=b)
		{
			System.out.println("Successfully enter into the first loop");
		}
		else if(a<b||a==b)
		{
			System.out.println("Successfully enter into the second loop");

		}
		else
		{
			System.err.print("Conditinal operator is not working properly");
		}
	}



	public static void main (String[] args)
	{
		//Operators p1 = new Operators();
		//p1.Arithmetic();
		//p1.unary();
		//p1.relational();
		//p1.conditional();

		System.out.println( "*****The Student result based on marks**************/n"); 

		Scanner s1 = new Scanner(System.in);
		System.out.println("Hi superhero what  is you name? \n");
		String name=s1.nextLine();
		System.out.printf("hey %s ,how many you  scored in Science \n" ,name);
		int marks= s1.nextInt();
		if(marks>=35)
		{
			//System.out.printf("Congratulation %s , you passed the exam" ,name); 

			if(marks>=35 && marks<=75)
			{
				System.out.println(" you secured the C grade");
			}
			else if (marks>=75 && marks<=80)
			{
				System.out.println(" you secured the B grade");
			}
			else if(marks>=80)
			{
				System.out.println(" you secured the A grade");
			}
		}
		else
		{
			System.out.println("sorry! you failed the exam");
		}




		//Print the statement based on day name 


	}
}
