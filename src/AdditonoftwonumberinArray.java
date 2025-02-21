import java.util.Arrays;

public class AdditonoftwonumberinArray {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b=  {2,3,4,5,6};
		
		int c= a.length+b.length;
		
		int f=0;
		
		for(int i=0;i<b.length;i++)//
		{
			int d = a[i]+b[i];
			
			b[f]=d;
			
			f++;
		}
		System.out.println(Arrays.toString(b));
	}

}
