import java.util.Arrays;

public class Addtwoarray {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,45,6};
		int[] b = {2,3,4,5,6,};
		
		  Integer[] s1 = new Integer[a.length+b.length];
		
		  int p=0;
		for(int i=0;i<a.length;i++)
		{
			s1[p]=a[i];
			 p++;
		}
		for(int i=0;i<b.length;i++)
		{
			s1[p]=b[i];
			p++;
		}
		System.out.println(Arrays.toString(s1));
		
		
	}

}
