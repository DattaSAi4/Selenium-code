package Afteralong;

public class largestnumberinarray {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,34,5,6,7,8};
		
		int p=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>p)
			{
				p=a[i];
			}
			
		}
		System.out.println("The largest number in the array"+p);
	}

}
