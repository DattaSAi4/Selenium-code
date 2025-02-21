package Programs;

public class Displaysmallestnumberfromanarray {
	
	public static void main(String[] args) {
		
		int a[] = {8,2,3,4,5};
		
		int p = a[0];
		
		for(int i =1;i<a.length;i++)
		{
			if(a[i]<p)
			{
				p=a[i];
			}
		}
		System.out.println("The smallest number in an array :"+p);
	}

}
