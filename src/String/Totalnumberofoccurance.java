//write a java program  to count the total number of occurance of a given string 
// given:Hello World  target:l output :3


package String;

public class Totalnumberofoccurance {
	
	public static void main(String[] args) {
		
		String s1 = "Hello World";
		
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.toLowerCase().charAt(i)=='l')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
