package Array;

public class Findthemaximumelementinaarray {
	
	
	public static void main(String[] args) {
		
		int[] a = {1,6,3,4,20};
		
		int p =a[0]; 
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i] >p)//6>1-->yes//3>6-->no//4>6--no//20>6//
			{
				p=a[i];//p=6//p=20
				
			}
			
		}
		System.out.println(p);
		
	}
	
	
	

}
