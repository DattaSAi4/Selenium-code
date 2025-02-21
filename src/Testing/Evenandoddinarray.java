package Testing;

public class Evenandoddinarray {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		int evennumber=0;
		int oddnumber=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			      System.out.println("The evennumber are: "+a[i]);
			}
			else
			{
			     System.out.println("The oddnumber are : "+a[i]);
			}
		}
		System.out.println(evennumber);
		System.out.println(oddnumber);
	}

}
