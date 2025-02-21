package String;

public class countspecialcharatersinstring {
	
	public static void main(String[] args) {
		
		 String name ="vinay@123";
		 
		 int count=0;
		 for(int i=0;i<name.length();i++)
		 {
			 if(!Character.isDigit(name.charAt(i)) && !Character.isLetter(name.charAt(i))  && !Character.isWhitespace(name.charAt(i)))
			 {
				 count++;
			 }
			
		 }
		 if(count==0)
		 {
			 System.out.println("There is no special charcters in given string  ");
		 }
		 else
		 {
			 System.out.println("The Spcial characters in a given string count " +count );
		 }
		 
		
		 
	}

}
