package Testing;

public class maxelementinthearray {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,876};
		
		    int p=a[0];
		    
		    for(int i=1;i<a.length;i++)
		    {
		    	    if(a[i]>p)//1==1-no//2<1-true
		    	    {
		    	     p=a[i];//p=1;
		    	    	 //p=2
		    	    }
		    	    
		    	   
		    }
		    System.out.println(p);
		    
	}

}
