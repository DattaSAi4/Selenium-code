package Arrayonelineque;

import java.util.ArrayList;
import java.util.Arrays;

public class findaddiionalelementinthelist {
	
	public static void main(String[] args) {
		

		ArrayList<String> s1 = new ArrayList<String>(Arrays.asList("Datta","Sai","Vinay","sunny"));
		ArrayList<String> s2 = new ArrayList<String>(Arrays.asList("Datta","Sai","Vinay"));
		
	         //ArrayList s3 = new ArrayList<>(s1);
	         
	         s1.removeAll(s2);
	         System.out.println(s1);
		
	}

}
