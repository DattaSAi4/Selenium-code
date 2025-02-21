package Testing;

public class numberofdigitsofagiven {
	public static void main(String[] args) {
		int a=1098;
		int count =0;
		while(a!=0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count);
	}

}
