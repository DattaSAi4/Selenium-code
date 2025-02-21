package String;

public class Constructor {
	
	
	       public  Constructor()
	       {
	    	  int a=10;
	    	  int b =20;
	       }
	       
	       public int add(int a, int b)
	       {
	    	   int c= a+b;
	    	   return c;
	       }
	       public  int sub(int b , int d)
	       {
	    	   int f= b-d;
	    	   return f;
	       }

	public static void main(String[] args) {
		 
		Constructor s1 = new Constructor();
		   System.out.println(s1.add(10, 20)); 
		   System.out.println(s1.sub(20, 10)); 

	}

}
