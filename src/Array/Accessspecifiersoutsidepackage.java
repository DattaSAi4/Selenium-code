package Array;



import Com.Javatopics.Accessspecifiersinsideclass; 

public class Accessspecifiersoutsidepackage extends Accessspecifiersinsideclass {
	
	
	public  static void protectd()
	{
		Accessspecifiersoutsidepackage s1 = new Accessspecifiersoutsidepackage();
		s1.addition();//public method
		s1.multiplication();//protected method can access in difereent package subclass
	}
	
     public static void main(String[] args) {
    	 
    	 Accessspecifiersinsideclass s2 = new Accessspecifiersinsideclass();
    	 s2.addition();//public method can access in different packages
    	 //s2.substraction();//default method we cant access outside of the package 
    	 //s2.multplication();//protected method we cant access outside of the package 
    	 //s2.divison();//private method we cant access out side of the package 
    	 protectd();
    	 
   
    	
    	 
                    
	}

}
