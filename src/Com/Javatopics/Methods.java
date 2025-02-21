//what is method -block of code to created to perform the action .if requires return the result to the caller 
// how to do we create a method 
//what are the parameters
//what is the return type
//syntax :access modifier static or non static return type method name(parameters)  throws Exception list 
//{
//     method body
//       return value;
	//}
package Com.Javatopics;


import java.util.Scanner;

public  class Methods {
	
	static int currentbalance = 1000;
	Scanner in = new Scanner(System.in);
	
	static boolean b1;

	public void greeting()
	{
		System.out.println("**********************Welcome to HDFC Bank**********************************");
	}
	
	public void depoist(int depositamount)
	{
		System.out.println("you want to deposit the money");
		String answer= in.nextLine();
		b1=(answer.equalsIgnoreCase("Yes") ? true : false);
		System.out.println("The " +depositamount + " Rs was successfully depoisted");
		currentbalance =currentbalance+depositamount;
		System.out.println("After deposit the current balance  :"+currentbalance);
			
		
	
	}
	
	public static void withdraw(int withdrawamount )
	{
		if(currentbalance>withdrawamount)
		{
		currentbalance=currentbalance-withdrawamount;
		System.out.println("After withdraw the current balance :" +currentbalance);
		}
		else
		{
		System.err.print("Sorry !The Withdraw amount was greater than current amount ");
		}
	}
	
	public static void main(String[] args)
	{
		Methods bank = new Methods();
		bank.greeting();
		bank.depoist(100);
		withdraw(200);
		
	}

}
