package interview;

public class MaxnumberfromAnArray {
	
public static void main(String[] args) {
	
	int[] a = {2,5,1,9,6};
	
	int ln=1;
	int i;
	for ( i = 0; i < a.length; i++) {
		
		     if( a[i] > a[ln])
		     {
		       ln = i;
		     }	    
	}
	System.out.println(a[ln]);
	 System.out.println("The index :"+ln);
	 
	 
	 
	 
	
}

}
