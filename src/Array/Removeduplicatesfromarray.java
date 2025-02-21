package Array;

import java.util.HashSet;

public class Removeduplicatesfromarray {

	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,3};
		
		       HashSet<Integer> s1 = new HashSet<Integer>();
		       
		       for(int s2:a)
		       {
		    	   s1.add(s2);
		       }
		       System.out.println(s1);
	}
}
