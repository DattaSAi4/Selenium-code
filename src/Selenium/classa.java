package Selenium;

public class classa {
	
	public void dog()
	{
		System.out.println("classa");
	}
	public static class classb extends classa
	{
		 public void dog()
		 {
			 System.out.println("classb");
		 }
		 
		  
		}
	public static void main(String[] args) {
		
		       classb s1 = new classb();
		     
		       s1.dog();
	}
}

