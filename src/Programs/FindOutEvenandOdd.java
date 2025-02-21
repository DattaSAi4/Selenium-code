/*Number of even and odd numberber in number 123454
 output even:3 odd:3*/

package Programs;

public class FindOutEvenandOdd {
	
	public static void main(String[] args) {
		
		
		            int a =123;
		            
		            int count =0;
		            int count1 =0;
		            
		           while(a!=0)   
		           {
		        	  int number = a%10;
		        	  
		        	  if(number%2==0)
		        	  {
		        		  
		        		  count++;
		        	  }
		        	  else
		        	  {
		        		  
		        		  count1++;
		        	  }
		        	  a=a/10;
		        	   
		           }
		           System.out.println("even number count :"+count);
		           System.out.println("oddnumber count :"+count1);
	}
	
	

}
