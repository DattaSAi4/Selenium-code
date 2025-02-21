
public class findsecondlargestnumber {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,32,43};
		
		int highest=a[0];
		int  secondhishest =a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>highest)//1>2//2>1
			{
				secondhishest=highest;//highest=1
				
			       highest=a[i];//
			}
			else if(a[i]>secondhishest)
			{
				secondhishest=a[i];
			}
			
		}
		System.out.println(secondhishest);
	
	}

}
