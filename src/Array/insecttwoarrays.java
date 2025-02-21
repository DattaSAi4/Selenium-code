package Array;

import java.util.HashSet;
import java.util.Set;

public class insecttwoarrays {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		
		int b[] = {2,3,5};
		
		
		     HashSet<Integer> array1 = new HashSet<Integer>();
		     HashSet<Integer> array2 = new HashSet<Integer>();
		     
		     for(int s1:a)
		     {
		    	 array1.add(s1);
		     }
		     //System.out.println(array1);
		     
		     for(int s2 :b)
		     {
		    	 if(array1.contains(s2))
		    	 {
		    		array2.add(s2);
		    	 }
		    	
		     }
		     System.out.println(array2);
		     
	}
  
//	public static void main(String[] args) {
//        int[] arr1 = {1, 2, 2, 3, 4};
//        int[] arr2 = {2, 3, 5};
//
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> intersection = new HashSet<>();
//
//        // Add elements of arr1 to set1
//        for (int num : arr1) {
//            set1.add(num);
//        }
//
//        // Find common elements
//        for (int num : arr2) {
//            if (set1.contains(num)) {
//                intersection.add(num);
//            }
//        }
//
//        // Print the intersection
//        System.out.println("Intersection: " + intersection);
//    }
}
