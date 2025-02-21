
public class ReverseStringArray {
	
	public static void main(String[] args) {
		
		String[] s1 = {"Datta","Sai","Vinay"};
		
		  String[] s3 = new String[s1.length];
		  
		  int r=0;
		  for(int i=s1.length-1;i>=0;i--)
		  {
			     s3[r] = s1[i];
			     r++;
		  }
		  
		  for(String s2:s3)
		  {
			  System.out.println(s2.toString());
		  }
	}

}
