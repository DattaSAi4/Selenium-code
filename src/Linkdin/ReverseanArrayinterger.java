package Linkdin;

import java.util.Arrays;

public class ReverseanArrayinterger {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,};
		
		     System.out.println(a.length);
		int p=0;
		
		            int[] d1 = new int[a.length];
		
		for(int i=a.length-1;i>=0;i-- )
		{
			d1[p]=a[i];
			
			p++;
		}
		System.out.println(Arrays.toString(d1));
	}

}
