package Programs;

public class Switch {
	
      public static void main(String[] args) {
		
    	
    	   
//    	   switch(a)
//    	   {
//    	   case 1: {
//    		  
//    		                int b=10;
//    		                int c=20;
//    		                int g=c+b;
//    		                System.out.println("The Addition of two numbers"+g);
//    		                break;
//    	   }
//    	   
//    	   case 2:{
//    		  
//    		              int r =90;
//    		              int f=10;
//    		              int y=r+f;
//    		              System.out.println("Teh substraction of two number" +y);
//    	   }
//    	   
//    	   }
    	   
    	   Switch s4 = new Switch(5);
    	   s4.match();
    	   meth();
    	   System.out.println(a);
      }

	private static int a;

	
     public Switch(int a)
      {
              this.a=a;
      }
      
      {
    	  System.out.println("empty block");
      }
      
      static {
    	  System.out.println("static block");
      }
      public static void meth()
      {
    	  System.out.println("static Methods block");
    	  
      }
      
      public void match()
      {
    	 System.out.println("Non static method"); 
      }
    
       
       
           
        
}
