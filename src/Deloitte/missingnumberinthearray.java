package Deloitte;

public class missingnumberinthearray {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,7,8};
		
		int n=a.length+1;
		
		int sum = n*(n+1)/2;
		
		int add=0;
		for(int f:a)
		{
			add=add+f;
		
	}
		
		int missingnumber= sum-add;
		System.out.println(missingnumber);
	}
	

}
