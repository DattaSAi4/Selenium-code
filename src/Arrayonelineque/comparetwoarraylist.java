package Arrayonelineque;

import java.util.ArrayList;
import java.util.Arrays;

public class comparetwoarraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> s1 = new ArrayList<String>(Arrays.asList("Datta","Sai","Vinay"));
		ArrayList<String> s2 = new ArrayList<String>(Arrays.asList("Datta","Sai","Vinay"));
		
		System.out.println(s1.equals(s2));
	}

}
