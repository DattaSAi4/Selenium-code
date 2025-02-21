package Programs;

public class Countnumberofdigits {

	public static void main(String[] args) {
	
		
		  int n4=124; int count =0; 
		  while(n4>0) 
		  
		  { 
			  n4=n4/10; //12-->//1//0
			  count++; //1----//2//3//
			  
		  }
		 System.out.println("Thenumberofdigits"+count);
		 
		//fibonic series
		//n1=0;n2=1,/n3=1
		int n=10;
		int n1=0;
		int n2 =1;
		System.out.println(n1+""+n2);
		
		for(int i =1;i<=10;i++)
		{
		  int sum =n1+n2;
		  System.out.println(sum);//
		         n1=n2;
		         n2= sum;//
		          
		}
		          
		          
		
		
		
				

	}

}
