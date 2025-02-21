package interview;


public class PrintNumberFromString {

	public static void main(String[] args) {
		
		String n1 = "vinay123";
		
	
//		for( int i=0;i<=n1.length()-1;i++)
//		{
//			if(!Character.isAlphabetic(n1.charAt(i))){
//				System.out.println(n1.charAt(i));
//			}
//			else
//			{
//				System.out.println(n1.charAt(i));
//			}
//			
//			
//		}
		
		     String digits = n1.replaceAll("[^0-9]", "");
		     System.out.println(digits);
		
	}
}
