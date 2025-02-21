package interview;



public class Arthematic {
	
	public static void main(String[] args) throws ArithmeticException  {
		
		try
		{
			int a= 10/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
