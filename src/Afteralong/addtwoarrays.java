package Afteralong;

import java.util.Arrays;

public class addtwoarrays {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int b[] = {2,3,4,5,};
		
		int c =a.length+b.length;
		int d=0;
		
		
		
		for(int i =0;i<a.length;i++)
		{
	            b[i]= a[i]+b[i];
	            
		}
		System.out.println(Arrays.toString(b));
		
	}

}
