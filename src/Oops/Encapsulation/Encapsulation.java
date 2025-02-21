/*
Encapsulation: hiding the date from  rest of the world providing the methods to access that data,
*/


package Oops.Encapsulation;



public class Encapsulation {
	
	public static void main(String[] args) {
		
		
		
		 OpenAccount a1 = new OpenAccount("SBI");
		 a1.setAdharnumber(1234);
		 a1.setPassportphoto(true);
		 a1.setDepositmoney(2000);
		 System.out.println("Adharcardnumber: "+a1.getAdharnumber());
         System.out.println("Passportphoto status: "+a1.isPassportphoto()) ;
         System.out.println("The initial money you can see after opened the account :"+a1.getDepositmoney());
         System.out.println("Please visit after two days to take the passbook and debitcard");
         
	}
	
	

}
