//variable:it is the storage where we can store the date .whenever we are want we use that data by calling 
//variable name 
//type:
//1.instance variable
//2.local variable 
//3.global variable 
//4.parameter
package Com.Javatopics;

public class variable {
                static int a = 10;//(global variable )int=data type ,a = variable,= equivalent operator,10-->data,
                int b = 20;//(instance variable)
     public  int  Addition()
     {
    	 int c= 30;//(local variable)
    	 int d = a+b+c;
    	 System.out.println("The Addition of "+ a+" +" +b+"+"+c+"="+d);
    	 return d;
     }
     public static void main(String[] args)
     {
    	 variable b1 = new variable();
    	 System.out.println(b1.Addition());
     }
  
}
