package Collections;

import java.util.ArrayList;

public class A1 {
	 public static void main(String[] args) {
	        // Autoboxing: primitive to wrapper object
	        int num = 5;
	        Integer obj = num; // Autoboxing

	        // Unboxing: wrapper object to primitive
	        int num2 = obj; // Unboxing

	        // Using wrapper classes with collections
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(num); // Autoboxing
	        list.add(obj);
	        
	        int a =8;
	        
	        Integer b =a;
	        System.out.println(a);
	        System.out.println(b);

	        System.out.println("List: " + list);

}
}
