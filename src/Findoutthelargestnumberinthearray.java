
public class Findoutthelargestnumberinthearray {
	
	public static void main(String[] args) {
		
		int[] b= {1,23,43,65,87};
		
		     int p=b[0];
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>p)
			{
				p=b[i];
			}
			
		}
		System.out.println(p);
		
	}

}
