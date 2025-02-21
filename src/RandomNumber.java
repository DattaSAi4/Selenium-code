import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		int s1 =5;
		
		for(int i=0;i<s1;i++)
		{
			  Random s2 = new Random();
			  System.out.println(s2.nextInt(50));
		}
	}

}
