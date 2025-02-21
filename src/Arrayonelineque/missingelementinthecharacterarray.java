package Arrayonelineque;

public class missingelementinthecharacterarray {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		int n= a.length+1;
		
		int sum = n*(n+1)/2;
		
		int add=0;
		
		for(int b:a)
		{
			add=add+b;
			}
		int missingnumber = sum-add;
		System.out.println(missingnumber);
	}
	

	

}
