package Linkdin;

public class MinimumoftheArray {
	
	public static void main(String[] args) {
		
		int[] a= {2,3,4,5,21};
		
		int p=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(p>a[i])
			{
				p=a[i];
			}
		}
		System.out.println(p);
	}

}
