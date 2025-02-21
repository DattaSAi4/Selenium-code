package Arrayonelineque;

public class maxnumberinthearray {
	public static void main(String[] args) {
		
		int a[] = {1,23,43,4321};
		
		int p=a[0];
		
		for(int i =1;i<a.length;i++)
		{
			if(p<a[i])
			{
				p=a[i];
			}
			
		}
		System.out.println(p);
				
		
	}

}
