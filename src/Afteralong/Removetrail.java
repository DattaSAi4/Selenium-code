package Afteralong;

public class Removetrail {
	
	public static void main(String[] args) {
		 String s1 ="            Datta   sai    vinay     ";
		 
		 String s2 = s1.strip();
		 
		 System.out.println(s2);
		 System.out.println(s2.replace(" ", ""));
	}

}
