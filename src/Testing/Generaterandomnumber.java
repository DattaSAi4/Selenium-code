package Testing;

import java.util.Random;

public class Generaterandomnumber {

	
	public static void main(String[] args) {
	
		     Random s1 = new Random();
		     
		     for(int i=0;i<3;i++)
		     {
		    	 System.out.println(s1.nextInt(10));
		     }
	}      
	
}
