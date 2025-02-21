package Programs;

public class leapyear {
	
	 static boolean flag ;
	
	public static  boolean  leapyear1(int year)
	{
		if(year%4==0)
		{
			flag=true;
		}
		else
		{

			flag = false;
		}
		
		if(year%100==0)
		{
			flag=true;
			
			if(year%100==0)
			{
				flag=true;
			}
			else
			{
				flag = false;
			}
		}
		else
		{
			flag = false;
		}
		
		
		return flag;
		
	}
	
	public static void main(String[] args) {
		
		leapyear1(2001);
	
		
		if(flag)
		{
			System.out.println("The given year is a leap year ");
		}
		else
		{
		System.out.println("The given year is  not a leap year ");
		}
		
	}

}
