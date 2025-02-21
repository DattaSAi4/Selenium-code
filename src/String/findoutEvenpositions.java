package String;

public class findoutEvenpositions {

public static void main(String[] args) {
	
	String s1 =" java";
	       String[] a1 = s1.split(" ");
	       
//	       for(String s4:a1)
//	       {
//	    	   System.out.println(s4);
//	       }
	       for (int i = 0; i < s1.length(); i+=2	) {
	            System.out.print(s1.charAt(i)+ " " );
	        }
	       
	       
	       
	       
	       
}
	
}
