package Array;

/**
 * 4.Find the max number from an array and print it along with its index
 * input:[2,5,1,9,6] && output:value-9 & index-3
 */

public class MaxNumberFromAnArray {

	public static void main(String[] args) {
		System.out.println("The maximun number of the array "+maxnumber());

	}


	public  static int maxnumber()
	{
		int[] input = {5,5,1,9,6,30};


		int max = input[0];

		for(int i=1;i<input.length;i++)
		{

			if( input[i]>max)//5>5--no//1>5--no//9>5--yes//6>9--no
			{
				max= input[i];//max=9
				System.out.println("the maximum number index" +i);
			}
            

		}
		return max;

	}



}
