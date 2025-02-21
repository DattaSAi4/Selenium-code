package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveandRemoveall {
	
	public static void main(String[] args) {
		
		ArrayList s1 = new ArrayList<>(Arrays.asList("datta","Sai","Vinay"));
		ArrayList s2 = new ArrayList<>(Arrays.asList("Sai","Vinay","Sunny"));
		System.out.println(s1);
		s1.remove(1);
		System.out.println(s1);
		s1.removeAll(s2);
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
