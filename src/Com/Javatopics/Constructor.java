//Constructor: we will use while creating the object .object we will create to allocate the 
//memory to the class. while allocating the memory to class the constructor will invoke 
//TYPES : default constructor and paramerterised constructor 
//if user didn't  add any  constructor means java will add by default constructor it is calledas implicit constructor 
//if usre add the constructor called as excplicit constructor 
package Com.Javatopics;

public class Constructor {
	
	Constructor()
	{
		
	}
	Constructor( int a)
	{
		System.out.println("Int a");
	}
	Constructor(int a , int b)
	{
		
	}

	
public  class vinay extends Constructor
{
	
	public void addition()
	{ 
		
		System.out.println("addition");
	}
	      	
}
	
	public static void main (String[] args)
	{
		//(class)    variable     operator    key word     constructor
		//Constructor   c1           =           new        Constructor();
		
	       
		Constructor   s1 =  new 	Constructor();
		
		    
	  
	}
	
	
	
	
	

}
