package Afteralong;

import java.util.Arrays;

public class inserttwoarrays {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,34,56,1};
		int[] b= {1,2,3,4,5};
		
	       int c =  a.length+b.length;
	       
	       for(int i=0;i<a.length;i++)
	       {
	    	   b[i]=a[i]+b[i];
	       }
	       System.out.println(Arrays.toString(b));
	}
	

}
