package Programs;

public class PrintEvenAndOddfromAnArray {

	public static void main(String[] args) {
		int[] a = {1,2,32,23};
		
		System.out.println("The evenumbers in a array.......");
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]%2==0)
			{
				System.out.println(+a[i]);
			}
			
		
			
		}
		
		  System.out.println("The odd number in a array"); for(int
		  i=0;i<=a.length-1;i++) {
		  
		  if(a[i]%2!=0) { System.out.println(+a[i]); }
		  
		  }
		 
		
	}
	
		
	
}


