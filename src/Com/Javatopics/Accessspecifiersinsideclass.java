/*
public-- If we mention public for class or method or variable we can access those members to anywhere within the class
           ,with in the package,outside of the package  
default -- with default we can access inside the package we cant access outside the package if we didnt not mention 
          any access spectifier if will take default  
protected-- protected is like default with in the package and one difference was we access of in subclass of outside the package 
private -- we can access only in the class
*
*/
package Com.Javatopics;

public class Accessspecifiersinsideclass {
	
	
	public int a= 10;
	int b =20;
	protected int c = 30;
	private int d = 40;
	
	public void addition()//we can access in the same class and package and other package
	{
		int add = a+b+c+d;
		System.out.println("The addition from public method:"+add);
	}
	 void substration()
	{
		 int sub = a-b-c-d;
		System.out.println("The Substraction from default method:"+sub);
		
	}
	 protected void  multiplication()
	 {
		 int multi = a*b;
		 System.out.println("The multiplication from protected method:"+multi);
	 }
	 private void division()
	 {
		 int div =a/b;
		 System.out.println("The Division from private method"+div);
	 }
	 public static void main(String[] args) {
		
		 Accessspecifiersinsideclass s1 = new Accessspecifiersinsideclass();
		s1.addition();//public method
		s1.substration();//default method
		s1.multiplication();//protected
		s1.division();//private
		
		 
		 
	}
	
	

}
