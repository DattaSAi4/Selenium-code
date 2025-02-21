/*1.print the sum of the integers in a integer array input:[1,2,,5,9,6]&
 * output:23*/

package Array;

public class Array1 {
	
	public static void main(String[] args) {
		
		int[] arr = {55555,54,2,25,9,765,6,43,98};
		
		int sum = 0;
		
		for(int i=0; i<arr.length;i++)
		{ 
			 sum += arr[i];
		}
		System.out.println(sum);
		
		
	
		int p= arr[0];
		for(int j =1;j<arr.length;j++)
		{
			if(arr[j]>p)
			{
				p=arr[j];
			}
			
		}
		System.out.println(p);
		
		
		
		
		
	}
	
	
	

}
