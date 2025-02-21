package JavaWebsite;

public class FindGreatestAmongThreeNumbers {
	
	public static void main(String[] args) {
		
		int a=25;
		int b=78;
		int c=87;
	
		int d =(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(d);
	}

}
