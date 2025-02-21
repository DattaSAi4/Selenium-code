/*wrapper class 
 * Converting the primitive datatypes in to object type boxing 
 * unboxing the objects in to primitive datatypes
 * 
 * */

package Com.Javatopics;

public class Wrappersclass {
	
	public static void main(String[] args) {
		int a= 10;
		int b=20;
		
	       Integer s1 = new Integer(b);
	       System.out.println(s1);
	       
	       Integer w1 = Integer.valueOf(a);
	       System.out.println(w1);
	       
	     int w2 = w1.intValue();
	     System.out.println(w2);
	      
	     
	       
	       
		
	}
	
	    

}
