package Linkdin;

import java.util.Arrays;

public class ReversearrayinString {
	
	public static void main(String[] args) {
		
		String[] a = {"Apple","orange","grapes"};
		
	
		  String[] f2 = new String[a.length];
		  
		  int g=0;
		  
		  for(int i =a.length-1;i>=0;i--)
		  {
			  
			  f2[g]=a[i];
			  g++;
			  
		  }
		  
		  System.out.println(Arrays.toString(f2));
		
		
		
		
		
	}

}
