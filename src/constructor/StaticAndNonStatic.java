package constructor;

public class StaticAndNonStatic {
	
	
	static int a =add();
	static int b = sub();
	
	public static  int add()
	{
       return 40+50;
	}
	
	public  static int sub()
	{
		
		return 50-40;
	}
	
	
	public static void main(String[] args) {
		
		
		
		int c =a+b;
		System.out.println(c);

		
	}

}
