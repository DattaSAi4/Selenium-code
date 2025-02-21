package Programs;

import java.util.Scanner;

public class Findoutthecharacter {
	
	public static void main(String[] args) {
		
		System.out.println("*********************ENTER THE CHARACTER*********************/n");
		Scanner s1 = new Scanner(System.in);
		
	
		 char string1 = s1.next().charAt(0);
		 
		if(string1>='A'&& string1<= 'Z'||string1>='a' && string1<='z')
		{
			System.out.println("The given character is alphabet"+string1);
		}
		else if(string1>'0' && string1<= '9')
		{
			System.out.println("The given charcter is a digit" +string1);
		}
		else
		{
			System.out.println("The given character is a special character"+string1);
		}
	}

}
