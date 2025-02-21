package Programs;

import java.util.Scanner;

import org.apache.commons.lang3.SystemUtils;

public class bank {

	public static void main(String[] args) {
		
         System.out.println("Enter the avialable balance in the bank");
         
         Scanner s1 = new Scanner(System.in);
                 int balance = s1.nextInt();
                 
         System.out.println("how much you are requesting to withdraw");
         
                         int   withdraw = s1.nextInt();
                         
                         if(balance> withdraw)
                         {
                        	 balance  =balance - withdraw;
                        	 System.out.println("The avaiable balance in the bank: "+balance);
                         }
                         else
                         {
                        	 System.err.println("Insufficent Balance");
                         }
	}
}
