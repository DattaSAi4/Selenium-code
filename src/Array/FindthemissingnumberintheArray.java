package Array;

public class FindthemissingnumberintheArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,7};
		
		int n=a.length+1;
		
	
		
		int sum = n*(n+1)/2;
		
		
		int add=0;
		
		for( int q1:a)
		{
			add=add+q1;
		}
		
		int missingnumber =sum-add;
		System.out.println("The missiging number from the array"+missingnumber);
	}

	
}
