package Programs;

import java.util.Arrays;

public class FindOutSecondHigheshNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1,23,4,567,6};
	    int highesh = arr[0];
	    int secondhighest = arr[0];
	    
	    for(int i=1;i<arr.length;i++)
	    {
	    	if(arr[i]>highesh)//23>1//i(2)-->4>23--no//i(3)-->567>23//i(4)-->6>567
	    	{
	    		secondhighest=highesh;//SH=1//SH=23
	    		
	    		highesh=arr[i];//highest=23//567
	    	
	    }
	     else if (arr[i]>secondhighest)//4>1//6>23
	    {
	         secondhighest=arr[i];	//SH=4
	    }
	    	
	    }
	    System.out.println(highesh);
    	System.out.println(secondhighest);
		
	}

}
