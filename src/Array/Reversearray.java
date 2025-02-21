/** 6.Reverse the array and print it in console
 * 
 * input:{true,false,true,false,true} output:{true,false,true,false,true}*/

package Array;



public class Reversearray {
	
	
	public static void main(String[] args) {
		
		String[] s1 = {"true","false","true","false","true","vinay"};
		
//		int[] arr = {1,2,3,4,5};
//		
//		    int size = arr.length;
//		    
//		    Arrays[] arr1  = new Arrays[size];
//		    
//		     int[] s1 = new int[size];
//		     int j =0;
//		     
//		     for( int i =arr.length-1 ;i>=0;i--)
//		     {
//		    	     s1[j] =arr[i];
//		    	     j=j+1;
//		     }
//		     for(  int s2:s1 )  
//		     {
//		    	 System.out.println(s2);
//		     }
		
		System.out.println(s1.length);
		
		int length = s1.length;
		
		String[] s2= new String[length];
		
			
		int f=0;
		for(int s3=s1.length-1; s3>=0;s3--)
		{
			s2[f]=s1[s3];
	            f++;
		}
		
		System.out.println(s2.toString());
		
		  for( String s6:s2)
		  { 
			  System.out.println(s6.toString());
			  }
		 
		
		
	}

}
