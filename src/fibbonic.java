
public class fibbonic {
	
	public static void main(String[] args) {
		
		int n1 =0;
		int n2=1;
		
	      int n=5;
	      
	      for(int i=0;i<n;i++)
	      {
	    	  int dum = n1+n2;
	    	  System.out.println(dum);
	    	  n1=n2;
	    	  n2=dum;
	      }
	}

}
