package Afteralong;

public class MissingnumberintheArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,6};
		
		int n = a.length+1;
		
		int sum = n*(n+1)/2;
		
		int add=0;
				
				for(int d:a)
				{
					add=add+d;
				}
			int missingnumber =sum-add;
			
			System.out.println(missingnumber);
		
		
	}

}
