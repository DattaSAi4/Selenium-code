
//write a jave program  to find the max LENGTH -WORD in a given string (If two words  are of same length the return the  first occuring 
 //word of max length
//   input: 	Hello how  are you Mooonnnnnnn      out:Mooonnnnnnn
 
//   input:      hello  are you ready             output:hello



package String;

public class MAxLenthwordinagivenstring {
	
	public static void main(String[] args) {
		
		String n1 ="hello are you ready sasyuveiyvc i";
		
		String n5="";
		
		String[] n2 = n1.split(" ");
		int b=0;
		for(String n3:n2)
		{
		    if(n3.length()>n5.length())
		    {
		    	n5=n3;
		    }
		    
			    
		}
		System.out.println(n5);
		
		//swap two number without temp variable
		int a=20;
		int y =10;
		
		 a = a-y;//10
		 y= a+y;//20
		 System.out.println(a);
		 System.out.println(y);
		 //Largest number in a given number
		 int[] u= {1,2,3,4,5,6,78};
		 
		 int o = 1;
		 
		 for(int i=0;i<u.length;i++)
		 {
			   if(u[o]<u[i])//1>1//1>2//2>3//3>4//4>5//5>6//6>78
			   {
				  u[o] =u[i];
			   }
		 }
		 System.out.println("The largest number in the given Array"+u[o]);
		 
		 
		 
	}
	
	
	
	
	

}
