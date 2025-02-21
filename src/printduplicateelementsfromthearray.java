import java.util.HashSet;

public class printduplicateelementsfromthearray {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,1,23,4,5,};
		
		                 HashSet unique = new HashSet<>();
		                 HashSet duplicate = new HashSet<>();
		                 
		     for( int s1:a)
		     {
		    	 if(!unique.add(s1))
		    	 {
		    		 duplicate.add(s1);
		    	 }
		     }
		     System.out.println(duplicate);
		    
	}

}
