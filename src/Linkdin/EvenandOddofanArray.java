package Linkdin;

public class EvenandOddofanArray {
	
	public static void main(String[] args) {
		
		int[] a = {21,23,24,26};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("In the Given Array the  Even numbers are:" +a[i]);
			}
			else
			{
				System.out.println("In the Given Array the  odd numbers are:" +a[i]);
			}
			
		}
		
	}

}
