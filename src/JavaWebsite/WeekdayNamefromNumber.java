package JavaWebsite;

import java.util.Scanner;

public class WeekdayNamefromNumber {
	
	public static void main(String[] args) {
		
		                  Scanner s1 = new Scanner(System.in);
		                  
		                  System.out.println("Enter a number i will say the day name  in week |n :");
		                  
		                            int s2 = s1.nextInt();
		                            
		                   switch(s2)
		                   {
		                   case 1:
		                	   System.out.println("1st day in week was monday");
		                	   break;
		                   case 2:
		                	   System.out.println("2nd  day in a week was Tuesday");
		                	   break;
		                	   
		                   case 3:
		                	   System.out.println("3rd day in a week was wednesday ");
		                	   break;
		                   case 4:
		                	   System.out.println("4rd day in a week was Thrusday");
		                	   break;
		                   case 5 :
		                	   System.out.println("5Th day in a week was friday");
		                	   break;
		                   case 6:
		                	   System.out.println("6th day in a week was saturday");
		                	   break;
		                   case 7:
		                	   System.out.println("7th day in a week was Sunday ");
		                	   break;
		                   
		                   }
		                   
	}

}
