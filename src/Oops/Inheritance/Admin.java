/*
    Inheritance: It is one of the  mechanism  the child class acquires the all the properties and  beaviour of parent class 
                is called Inheritance 
                Types: Single Inheritance , multiple  level inheritance ,hybrid inheritance ,
                multiple inheritance will not be possible in class in java in interface it will be possible 
                
*
*
*/


package Oops.Inheritance;

public class Admin extends Developer {
	
	
	public void approveaccess()
	{
		super.Readaccess();///super key word is used the call the methods from the parent class
		System.out.println("he can approve the access");
	}
	public void Readaccess() {
		
	}
	      
	
	
public static void main(String[] args) {
	
	System.out.println("*****************Tester*************");
	Tester t1 = new Tester();
	t1.Readaccess();
	
	System.out.println("*************Developer*************");
	Developer d1 = new Developer();
       d1.Readaccess();
	    d1.WriteAceess();
	
		
		 System.out.println("***************Admin********************"); 
		 Admin a1 =new Admin(); 
		 a1.Readaccess(); 
		 a1.WriteAceess(); 
		 a1.approveaccess();
		 
	
}
	
	

}
