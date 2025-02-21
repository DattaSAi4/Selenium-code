package Selenium;

public class Namemethod {
	
public String name(Names name,String s1)
{
	switch(name)
	{
	case Vinay:
		 return  s1;
	
	case Sai : 
		return s1;
	case Datta:
		 return "my name is vinay";
				
	}
	
	return s1;

	
	}
public static void main(String[] args) {
	
	        Namemethod s3 = new Namemethod();
	       
	        System.out.println( s3.name(Names.Datta, "vinay"));
}

}
