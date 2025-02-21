//write a java program to modify the string to following pattern 
//change  odd words  to uppercase  and reverse the  even words
//input: This is a test string!!
//output:THIS si  A tset STRING!!


package String;

public class Changethestringintogivenpattern {
	
  public static void main(String[] args) {
	
	  String s1 ="This is a test string!!";
	  
	  String s4 ="";
	  
//	 // StringBuilder d1 = new StringBuilder(s1);
//	  
//	  String[] s2 = s1.split(" ");
//	  
//	 // System.out.println( s1.split(" ").length);
//	  
//	 
//	for(String s3:s2)
//	  {
//		//System.out.println(s3);
//		if(s3.length()%2==0)
//		{
//		 
//			
//			
//			
//		}
//		System.out.println(s1);
//	  }
	
	for(int i =0;i<s1.length();i++)
	{
		s1=s4+s1.charAt(i);
		
	}
	System.out.println(s1);
	
	  
}	

}
