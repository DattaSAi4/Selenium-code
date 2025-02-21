package Array;

import java.util.Arrays;

public class MergeAraay {

	public static void main(String[] args) {

		String[] choclates = {"kitkat","Milkybar","diarymilk"};
		String[] names = {"vinay","sai","datta"};
		int length = choclates.length+names.length;
		String[] belongs = new String[length];
		int p=0;
		for(String s1:choclates)
		{
			belongs[p]=s1;
			p++;
		}
		for(String s2:names)
		{
			belongs[p]=s2;
			p++;
		}
		//System.out.println(names);
		System.out.println(Arrays.toString(belongs));
		
		
		


	}

}
