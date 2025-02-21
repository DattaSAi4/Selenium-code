package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindOutOddNumberfromarray {
	
	
public  static boolean findodd(List<Integer> number)
{
	
	for( int l1:number)
	{
		if(l1 % 2==0)
		{
			return false;
		}
	}
	return true;
	

}
public static void main(String[] args) {
	
	   List<Integer> number = Arrays.asList(3,5,7,9);
	
	   System.out.println(findodd(number));
}



}
