import java.util.Arrays;

public class insecttwoarrays {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int[] b = {2,3,4};
		
		 Integer[] s1 = new Integer[a.length+b.length];
		 
		 int p=0;
		 for(int s4:a)
		 {
			 s1[p]=s4;
			 p++;
		 }
		 for(int s6:b)
		 {
			 s1[p]=s6;
			 p++;
		 }
		 System.out.println(Arrays.toString(s1));
	}

}
