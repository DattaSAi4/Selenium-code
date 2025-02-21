package Afteralong;

public class palidraom {
	
	public static Boolean pali(String s1)
	{
		Boolean result = true;
		 int s2 =  s1.length();	
		 for(int s3=0; s3<s2/2;s3++)
		 {
			 if(s1.charAt(s3)!=s1.charAt(s2-s3-1))
			 {
				 result= false;
				 break;
			 }
		 }
		return result;
		
	}
	public static void main(String[] args) {
	
		System.out.println(	pali("Tomoto"));
		System.out.println(pali("sis"));
		System.out.println(pali("vinay"));
	}

}
