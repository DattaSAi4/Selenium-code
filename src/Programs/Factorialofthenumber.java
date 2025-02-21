package Programs;

public class Factorialofthenumber {
	
	public static void main(String[] args) {
		
		//5!=5*4*3*2*1=120
		int num =5;
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;//fact=1 i=1//fact =2 i=2//i=3 fact=6//i=4, fact =24 //i=5  fact =120
		}
		System.out.println(fact);
	}

}
