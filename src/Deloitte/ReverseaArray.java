package Deloitte;

import java.util.Arrays;

public class ReverseaArray {
	
	public static void main(String[] args) {
	
		String a[] = {"Datta","Sai","Vinay"};
		
		 int b=a.length;
		 
		String[] s2 = new String[b];
		
	int f=0;
		for(int i=a.length-1;i>=0;i--)
		{
		              	
			 s2[f]=a[i];
			 f++;
		}
		System.out.println(Arrays.toString(s2));
	}

}
