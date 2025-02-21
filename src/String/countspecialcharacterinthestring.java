//write a java program  to find the count of uppercase letters ,lowercase letters 
//digits,and special characters  and in given string 
//intput :javA5is&Su6p%eR
//Uppercaseletter:4
//Lowercaseletter:7
//special charcters:2,Digits:2


package String;

public class countspecialcharacterinthestring {
	
	
	public static void main(String[] args) {
		
		String s1 ="javA5is&Su6p%eR";
		
		int digit=0;
		int uppercase =0;
		int lowercase=0;
		int spclcharacter=0;
		for(int i=0;i<s1.length();i++) {
		
			if(Character.isDigit(s1.charAt(i)))
			{
				digit++;
			}
			else if(Character.isUpperCase(s1.charAt(i)))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(s1.charAt(i)))
			{
				lowercase++;
			}
			else
			{
				spclcharacter++;
			}
		}
		System.out.println("The number of digits in the given string :" +digit);
		System.out.println("The Uppercase letters in the given string: " +uppercase);
        System.out.println("The lowercase Letters in the given string: " +lowercase );
        System.out.println("The spcl charcter in the given string :" +spclcharacter);
	}

}
