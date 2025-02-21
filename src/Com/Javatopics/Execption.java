/*Exception
 * --->if the program  stops because of any runtime error is called exception
 * we can handle that exception  by using exception handling -by  handling that exception we can run the program with out  any distractions 
 * in Exception handling Try and catch box are main 
 * In try block we will  mention  where exactly the error is coming  that line we will mention 
 * in catch block we will catch the error and say the user what exactly happening by using logs 
 * finally will exactly whether we got the exception or the information present in finally block will execute
 * */


package Com.Javatopics;

public class Execption {
	
	
	public static void main(String[] args) {
		int a = 9;
		int b =  0;
		
		
		
		try
		{
			int c = a/b;
		}
		
		catch(ArithmeticException wq)
		{
			System.out.println("we excape from the program");
		}
		finally
		{
			System.out.println("Finally block will execute wthether we had the execption or not ");
		}
	}
	
	
	

}
