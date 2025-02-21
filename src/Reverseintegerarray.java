import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class Reverseintegerarray {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		
		int p=0;
		
		for(int i=a.length-1;i>=0;i--)
		{
			       a[p] = a[i];
			       p++;
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
