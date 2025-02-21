package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Cursor {
	
	public static void main(String[] args) {
		
		 ArrayList a1 = new ArrayList<>(Arrays.asList("Datta","Sai","Vinay"));
		 
		                 Iterator a2 = a1.iterator();
		 
		while(a2.hasNext())
		 {
			      String  s4 = (String) a2.next();
			      System.out.println(s4);
		 }
		 
	}

}
