package Array;

import java.lang.reflect.Array;
import java.util.Arrays;


public class AddtwoArrays {
	
	public static void main(String[] args) {
		
		   int[] a = {1,2,3,4,5,6};
		   int[] b = {1,2,3,4,5,6};
		   
		    // Array[] a1 = new Array[20];
		     
		           for(int i=0;i<a.length;i++ )
		           {
		        	    b[i]=a[i]+b[i]; 
		        	  System.out.println("The Addition of Two arrays"+b[i]);
		        	 
		           }
		           System.out.println(Arrays.toString(b));
		           
		   
	}

}
