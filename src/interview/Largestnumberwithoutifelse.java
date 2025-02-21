package interview;

public class Largestnumberwithoutifelse {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=28;
		 int largest=a>b?(a>c?a:c):(b>c?b:c);
		            //10>20?28:28
		 System.out.println(largest);
	}
}
