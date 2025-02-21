package String;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Randomnumberandstring {
	
	public static void main(String[] args) {
		//generate the random number
		Random s1 = new Random();
		int rn= s1.nextInt(100);
		System.out.println(rn);
		      
		           String s4 = RandomStringUtils.randomNumeric(10);
		           System.out.println(s4);
		           
		           //generate the random string
		           String s5 = RandomStringUtils.randomAlphabetic(5);
		           System.out.println(s5);
		           
		          
	}

}
