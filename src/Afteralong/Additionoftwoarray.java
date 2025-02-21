package Afteralong;

import java.util.Arrays;

public class Additionoftwoarray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,45,6};
		int[] b = {1,2,3,54,7};
		
		for(int i =0;i<a.length;i++)
		{
			b[i]=a[i]+b[i];
		}
		System.out.println(Arrays.toString(b));
			
	}
}
