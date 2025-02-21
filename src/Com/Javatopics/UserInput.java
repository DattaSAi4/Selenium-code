package Com.Javatopics;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Can you please confirm your name to movefurther \n");
		String name =s1.nextLine(); 
		System.out.printf(" hi  %s ,Are you facing problem in Deposit or Withdraw? \n",name);
		String problem =s1.nextLine();
		System.out.printf("Thank you our respective %s team will get back to you shortly \n",problem);
		s1.close();
		
	}
}
