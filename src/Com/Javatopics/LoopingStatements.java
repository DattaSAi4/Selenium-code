//Looping statement:these are statements that execute one or more statements repeatly 
//while
//do-while
//for
//foreach
//Print 1 to 20 numbers
//print even numbers numbers btw 200 to 400
//print the numbers which are divisible by 7  for the range of 1500 to 2000
package Com.Javatopics;

public class LoopingStatements {

	public static void main(String[] args) {
		  int i = 0;
		System.out.println("*********Print 1 to 20 numbers**********");
		while(i<=20)
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println("*********print even numbers numbers btw 200 to 400**********");
		  int num =200;
		  while(num<220)
		  {  
			int d = num%2;
			if(d==0)
			{
				System.out.printf("The even number btw 200 to 400 : " +num+"\n");
			}
			num++;
			 
		  }
	}
}
