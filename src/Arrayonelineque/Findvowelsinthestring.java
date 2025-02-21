package Arrayonelineque;

public class Findvowelsinthestring {
	
         public static void main(String[] args) {
			
        	 String s1 ="vinay";
        	 String s2 = s1.toLowerCase();
        	 int count =0;
        	 
        	 for(int i=0;i<s1.length();i++)
        	 {
        		          char ch =   s2.charAt(i);
        		          
        		          if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
        		        	  
        		          {
        		        	  count++;
        		          }
        		 
        	 }
        	 System.out.println(count);
        	
		}

}
