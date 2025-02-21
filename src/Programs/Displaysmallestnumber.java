package Programs;

public class Displaysmallestnumber {
	
	public static void main(String[] args) {
		 
		 int a=10;
		 int b=11;
		 int c=40;
		 int d=9;
		 
		 if(a<b && a<c  && a<d)
		 {
			System.out.println(a);
		 }
		 else if(b<a &&b<c &&b<d)
		 {
			 System.out.println("The smallest number"+b); 
		 }
		 else if(c<a && c<b && c<d)
		 {
			 System.out.println(c);
		 }
		 else
		 {
			 System.out.println(d);
		 }
	}

}
