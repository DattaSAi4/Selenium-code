package Deloitte;

public class Findthelargestnumberinaarray {
	
	public static void main(String[] args) {
		
		   int a[]= {1,2,34,5,6,7};
		   
		   int p=a[0];
		   
		   for(int i=1;i<a.length;i++)
		   {
			   if(p<a[i])
			   {
				  p= a[i];
			   }
		   }
		   System.out.println(p);
	}

}
