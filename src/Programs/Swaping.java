package Programs;

public class Swaping {

	public static void main(String[] args) {
		
		int a =20 ; int b =10 ;
		
//	 System.out.println("**********/Swapping with temporary variable**************** ");
//		
//		System.out.println("Before interchange A: '"+a+"'b: "+b);
//		
//		 int temp = a;
//		 a=b;//a=10
//		 b=temp;//b=20;
//		 
//		 System.out.println("After interchange A: '"+a+"'b: "+b);
		 
//	System.out.println("***********//Swapping without temporary variable**************** ");
//	
//	         System.out.println("Before interchange A: '"+a+"'b: "+b);
//	         
//	         a=a+b;//a=30
//	         b=a-b;//b=20
//	         a=a-b;//a=10
//	         
//       System.out.println("After interchange A: '"+a+"'b: "+b);  
	      
	  System.out.println("***********//Swapping with multiplication and divided **************** ");
	  
	  System.out.println("Before interchange A: '"+a+"'b: "+b);
	  
	      
	      a=a*b;
	      b=a/b;
	      a=a/b;
	   System.out.println("After interchange A: '"+a+"'b: "+b);    
		 
	 
	}

}
