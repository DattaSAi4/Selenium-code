package interview;

import java.util.function.BiFunction;

public class inbuildinterface {
	
//	  public static void main(String[] args) {
//	        // Using BiFunction to add two numbers
//	        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
//
//	        // Testing the BiFunction
//	        int result = add.apply(5, 3);
//	        System.out.println("The sum is: " + result); // Output: The sum is: 8
//	    }
	
	public static void main(String[] args) {
		
		
		BiFunction<Integer,Integer,Integer> add=(a,b) ->(a+b);
		
		int result = add.apply(3, 4);
				System.out.println(result);
				
				
				BiFunction <String,String,String> add1 =(a,b) ->(a+b);
				
				System.out.println(add.apply(10, 5));
	}

}
