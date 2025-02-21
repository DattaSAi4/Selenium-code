package Array;

/* Array-->it is a non primitive data type it holds the fixed number of values in sequesces order
 * 1.print the sum of the integers in a integer array input:[1,2,,5,9,6]&
 * output:23
 * 
 * 2.print the average of the integers in n integer array input:[2,5,3,9,6] &
 * output:5
 * 
 * 3.merge two arrays and print the output in the console input:["chai"
 * ,"cofee"] &&[ "milk","Water" ,"coke"] output:["chai" ,"coffee","milk","Water"
 * ,"coke"]
 * 
 * 4.Find the max number from an array and print it along with its index
 * input:[2,5,1,9,6] && output:value-9 & index-3
 * 
 * 5.Find the minimum length word from an array and ping it along with its index
 * input:["coffee","milk","chai","Water" ,"coke"] output:value -chai&index-2
 * 
 * 6.Reverse the array and print it in console
 * 
 * input:{true,false,true,false,true} output:{true,false,true,false,true}
 * 
 */
 import java.util.List;
  
  public class Arrays { public static void main(String[] args) {


  
  System.out.println("1.print the sum of the integers in a integer array \r\n"
 + "  input:[1,2,,5,9,6]& output:23");
  
  int e=0; int[] i = {1,2,5,9,6}; for(int j=0; j<5 ;j++) {
	  System.out.println(i[j]);

	  e=e+i[j]; } System.out.println("The Addition of Array: \n"+e);

	  System.out.println(
			  "****************************************************************\n");


	  System.out.
	  println("2.print the average of the integers in n integer array\r\n" +
			  "      input:[2,5,3,9,6] & output:5");

	  int a[] = {2,5,3,9,6};
	  
	  int c=0; 
	  
	  int d;

	  for(int b= 0;b<=4;b++)
		  
	  {
		  System.out.println(a[b]); 
		  c=c+a[b]; 
		  } 
	      d =c/5;
	  System.out.println("The average of the Array :" +d);
  }
  }

