import java.util.Arrays;
import java.util.HashMap;

public class ArrayFindNumberfrequesy {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,3,5,6,7};
		
		     HashMap<Integer ,Integer> s3 = new HashMap<>();
		
		for(int s1:a)
		{
			if(s3.containsKey(s1))
			{
				s3.put(s1, s3.get(s1)+1);
			}
			else
			{
				s3.put(s1, 1);
			}
		}
		System.out.println(s3);
	}

}
