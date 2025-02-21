package interview;

public class MergetwoArraysintergers {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		int c =a.length+b.length;
		
		    int f=0;
		     
		 Integer[] s1 = new Integer[6];
		
		for(int i=0;i<a.length;i++)
		{
			 s1[f] = a[i];
			 f++;
			
		}
		for(int v=0;v<b.length;v++)
		{
			s1[f]=b[v];
			f++;
		}
		for(int s5:s1)
		{
			System.out.println(s5);
		}
	}

}
