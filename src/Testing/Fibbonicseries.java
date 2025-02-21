package Testing;

public class Fibbonicseries {
	
	public static void main(String[] args) {
		
		int n1 =0;
		int n2 =1;
		int n =10;
		System.out.println(n1);
		System.out.println(n2);
		for(int i =2;i<=n;i++)
		{
			int sum = n1 +n2;//1//
			System.out.println(sum);
			      n1=n2;
			      n2=sum;
			
		}
		
	}

}
