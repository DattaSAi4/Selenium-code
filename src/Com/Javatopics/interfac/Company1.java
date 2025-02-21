package Com.Javatopics.interfac;


/*we have 5 companys all the companys should follow the same rules so that in interface we give the what are the rules
they have to follow .in specific company they will write the code how they are going to be  implement  these rules
in interface we will say what to do ,how to do we implements in specific company class
*
*/ 

public interface Company1 {
	
	public void idcard();
	public void formaldress();
	public void nopendrives();
	default  void hours()//in java 8//when we have to give default means the remaining also should follow this as well if theywant to change means they can change 
	{
		System.out.println("employee should work 8 hours in office");
		 shoes();
	}
	 static void shoes()//in java 8 //in interface our implematation method outside the world if anyone want to use means in this siuation means we will use static 
	{
		System.out.println("employee should wear formal shoes");
	}
	
}
